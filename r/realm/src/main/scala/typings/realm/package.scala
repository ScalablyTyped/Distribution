package typings.realm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Extracts an intersection of keys from T, where the value extends the given PropType.
  */
type ExtractPropertyNamesOfType[T, PropType] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends PropType? K : never}[keyof T] */ js.Any

/**
  * Joins T stripped of all keys which value extends Realm.Collection and all inherited from Realm.Object,
  * with only the keys which value extends Realm.List, remapped as Arrays.
  */
//
type RealmInsertionModel[T] = (typings.std.Omit[
typings.std.Omit[
  T, 
  /* keyof realm.Realm.Object */ typings.realm.realmStrings.keys | typings.realm.realmStrings.entries | typings.realm.realmStrings.toJSON | typings.realm.realmStrings.isValid | typings.realm.realmStrings.objectSchema | typings.realm.realmStrings.linkingObjects | typings.realm.realmStrings.linkingObjectsCount | typings.realm.realmStrings._objectId | typings.realm.realmStrings.addListener | typings.realm.realmStrings.removeListener | typings.realm.realmStrings.removeAllListeners
], 
typings.realm.ExtractPropertyNamesOfType[T, typings.realm.Realm.Collection[js.Any]]]) & (typings.realm.RealmOptionalParMappedModel[
typings.std.Pick[T, typings.realm.ExtractPropertyNamesOfType[T, typings.realm.Realm.List[js.Any]]]])

/**
  * Exchanges properties defined as Realm.List<Model> with an optional Array<Model | RealmInsertionModel<Model>>.
  */
type RealmOptionalParMappedModel[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? T[K] extends realm.Realm.List<infer GT>? std.Array<any | realm.RealmInsertionModel<any>> : never}
  */ typings.realm.realmStrings.RealmOptionalParMappedModel & org.scalablytyped.runtime.TopLevel[T]
