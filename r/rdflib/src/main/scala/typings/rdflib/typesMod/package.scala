package typings.rdflib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Bindings = org.scalablytyped.runtime.StringDictionary[typings.rdflib.tfTypesMod.Term]
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.tfTypesMod.Term
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typings.rdflib.collectionMod.default[C]
  */
  type FromValueReturns[C /* <: typings.rdflib.nodeInternalMod.default */] = js.UndefOr[typings.rdflib.typesMod._FromValueReturns[C] | scala.Null]
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.namedNodeMod.default
    - typings.rdflib.literalMod.default
    - typings.rdflib.collectionMod.default[
  typings.rdflib.nodeInternalMod.default | typings.rdflib.blankNodeMod.default | typings.rdflib.collectionMod.Collection[js.Any] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default]
    - typings.rdflib.blankNodeMod.default
    - typings.rdflib.variableMod.default
    - typings.rdflib.emptyMod.default
  */
  type ObjectType = typings.rdflib.typesMod._ObjectType | (typings.rdflib.collectionMod.default[
    typings.rdflib.nodeInternalMod.default | typings.rdflib.blankNodeMod.default | typings.rdflib.collectionMod.Collection[js.Any] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default
  ])
  /* Rewritten from type alias, can be one of: 
    - typings.rdflib.tfTypesMod.Term
    - typings.rdflib.nodeInternalMod.default
    - typings.std.Date
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typings.rdflib.collectionMod.default[
  typings.rdflib.nodeInternalMod.default | typings.rdflib.blankNodeMod.default | typings.rdflib.collectionMod.Collection[js.Any] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default]
  */
  type ValueType = js.UndefOr[
    typings.rdflib.typesMod._ValueType | (typings.rdflib.collectionMod.default[
      typings.rdflib.nodeInternalMod.default | typings.rdflib.blankNodeMod.default | typings.rdflib.collectionMod.Collection[js.Any] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default
    ]) | typings.std.Date | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
}
