package typings.reduxOrm

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.reduxOrm.fieldsMod.Field
import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.modelMod.IdType
import typings.reduxOrm.reduxOrmStrings.arrName
import typings.reduxOrm.reduxOrmStrings.fields
import typings.reduxOrm.reduxOrmStrings.id
import typings.reduxOrm.reduxOrmStrings.idAttribute
import typings.reduxOrm.reduxOrmStrings.items
import typings.reduxOrm.reduxOrmStrings.itemsById
import typings.reduxOrm.reduxOrmStrings.mapName
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("redux-orm/db/Table", "Table")
  @js.native
  /**
    * Creates a new {@link Table} instance.
    *
    * @param   userOpts - options to use.
    * @param   [userOpts.idAttribute=DefaultTableOpts.idAttribute] - the id attribute of the entity.
    * @param   [userOpts.arrName=DefaultTableOpts.arrName] - the state attribute where an array of
    *                                             entity id's are stored
    * @param   [userOpts.mapName=DefaultTableOpts.mapName] - the state attribute where the entity objects
    *                                                 are stored in a id to entity object
    *                                                 map.
    * @param   [userOpts.fields=DefaultTableOpts.fields] - mapping of field key to {@link Field} object
    */
  open class Table[MClass /* <: Instantiable0[AnyModel] */] () extends StObject {
    def this(userOpts: ModelTableOpts[MClass]) = this()
    
    def getEmptyState(): TableState[MClass] = js.native
  }
  
  type ArrName[MClass /* <: Instantiable0[AnyModel] */] = ExtractModelOption[MClass, arrName, items]
  
  trait DefaultMeta[MIdType] extends StObject {
    
    var maxId: Null | Double
  }
  object DefaultMeta {
    
    inline def apply[MIdType](): DefaultMeta[MIdType] = {
      val __obj = js.Dynamic.literal(maxId = null)
      __obj.asInstanceOf[DefaultMeta[MIdType]]
    }
    
    extension [Self <: DefaultMeta[?], MIdType](x: Self & DefaultMeta[MIdType]) {
      
      inline def setMaxId(value: Double): Self = StObject.set(x, "maxId", value.asInstanceOf[js.Any])
      
      inline def setMaxIdNull: Self = StObject.set(x, "maxId", null)
    }
  }
  
  type ExtractModelOption[MClass /* <: Instantiable0[AnyModel] */, K /* <: idAttribute | arrName | mapName | fields */, DefaultValue /* <: String */] = DefaultValue
  
  type IdAttribute[MClass /* <: Instantiable0[AnyModel] */] = ExtractModelOption[MClass, idAttribute, id]
  
  type MapName[MClass /* <: Instantiable0[AnyModel] */] = ExtractModelOption[MClass, mapName, itemsById]
  
  trait ModelTableOpts[MClass /* <: Instantiable0[AnyModel] */] extends StObject {
    
    val arrName: ArrName[MClass]
    
    val fields: /* import warning: importer.ImportType#apply Failed type conversion: MClass['fields'] */ js.Any
    
    val idAttribute: IdAttribute[MClass]
    
    val mapName: MapName[MClass]
  }
  object ModelTableOpts {
    
    inline def apply[MClass /* <: Instantiable0[AnyModel] */](
      arrName: ArrName[MClass],
      fields: /* import warning: importer.ImportType#apply Failed type conversion: MClass['fields'] */ js.Any,
      idAttribute: IdAttribute[MClass],
      mapName: MapName[MClass]
    ): ModelTableOpts[MClass] = {
      val __obj = js.Dynamic.literal(arrName = arrName.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], idAttribute = idAttribute.asInstanceOf[js.Any], mapName = mapName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelTableOpts[MClass]]
    }
    
    extension [Self <: ModelTableOpts[?], MClass /* <: Instantiable0[AnyModel] */](x: Self & ModelTableOpts[MClass]) {
      
      inline def setArrName(value: ArrName[MClass]): Self = StObject.set(x, "arrName", value.asInstanceOf[js.Any])
      
      inline def setFields(
        value: /* import warning: importer.ImportType#apply Failed type conversion: MClass['fields'] */ js.Any
      ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setIdAttribute(value: IdAttribute[MClass]): Self = StObject.set(x, "idAttribute", value.asInstanceOf[js.Any])
      
      inline def setMapName(value: MapName[MClass]): Self = StObject.set(x, "mapName", value.asInstanceOf[js.Any])
    }
  }
  
  type TableIndexes[MClass /* <: Instantiable0[AnyModel] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in redux-orm.redux-orm/Model.FieldSpecKeys<std.InstanceType<MClass>, redux-orm.redux-orm.OneToOne | redux-orm.redux-orm.ForeignKey> ]: string}
    */ typings.reduxOrm.reduxOrmStrings.TableIndexes & TopLevel[Any]
  
  trait TableOpts extends StObject {
    
    val arrName: js.UndefOr[String] = js.undefined
    
    val fields: js.UndefOr[StringDictionary[Field]] = js.undefined
    
    val idAttribute: js.UndefOr[String] = js.undefined
    
    val mapName: js.UndefOr[String] = js.undefined
  }
  object TableOpts {
    
    inline def apply(): TableOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableOpts]
    }
    
    extension [Self <: TableOpts](x: Self) {
      
      inline def setArrName(value: String): Self = StObject.set(x, "arrName", value.asInstanceOf[js.Any])
      
      inline def setArrNameUndefined: Self = StObject.set(x, "arrName", js.undefined)
      
      inline def setFields(value: StringDictionary[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setIdAttribute(value: String): Self = StObject.set(x, "idAttribute", value.asInstanceOf[js.Any])
      
      inline def setIdAttributeUndefined: Self = StObject.set(x, "idAttribute", js.undefined)
      
      inline def setMapName(value: String): Self = StObject.set(x, "mapName", value.asInstanceOf[js.Any])
      
      inline def setMapNameUndefined: Self = StObject.set(x, "mapName", js.undefined)
    }
  }
  
  @js.native
  trait TableState[MClass /* <: Instantiable0[AnyModel] */] extends StObject {
    
    val indexes: TableIndexes[MClass] = js.native
    
    val meta: DefaultMeta[IdType[InstanceType[MClass]]] = js.native
  }
}
