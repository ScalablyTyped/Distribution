package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-model", "MarkType")
@js.native
class MarkType[S /* <: Schema[js.Any, js.Any] */] () extends StObject {
  
  /**
    * Create a mark of this type. `attrs` may be `null` or an object
    * containing only some of the mark's attributes. The others, if
    * they have defaults, will be added.
    */
  def create(): Mark[S] = js.native
  def create(attrs: StringDictionary[js.Any]): Mark[S] = js.native
  
  /**
    * Queries whether a given mark type is
    * [excluded](#model.MarkSpec.excludes) by this one.
    */
  def excludes(other: MarkType[S]): Boolean = js.native
  
  /**
    * Tests whether there is a mark of this type in the given set.
    */
  def isInSet(set: js.Array[Mark[S]]): js.UndefOr[Mark[S] | Null] = js.native
  
  /**
    * The name of the mark type.
    */
  var name: String = js.native
  
  /**
    * When there is a mark of this type in the given set, a new set
    * without it is returned. Otherwise, the input set is returned.
    */
  def removeFromSet(set: js.Array[Mark[S]]): js.Array[Mark[S]] = js.native
  
  /**
    * The schema that this mark type instance is part of.
    */
  var schema: S = js.native
  
  /**
    * The spec on which the type is based.
    */
  var spec: MarkSpec = js.native
}
