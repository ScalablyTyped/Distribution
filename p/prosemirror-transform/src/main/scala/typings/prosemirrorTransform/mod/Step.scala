package typings.prosemirrorTransform.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorTransform.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "Step")
@js.native
class Step[S /* <: Schema[_, _] */] () extends js.Object {
  /**
    * Applies this step to the given document, returning a result
    * object that either indicates failure, if the step can not be
    * applied to this document, or indicates success by containing a
    * transformed document.
    */
  @JSName("apply")
  def apply(doc: Node[S]): StepResult[S] = js.native
  /**
    * Get the step map that represents the changes made by this step,
    * and which can be used to transform between positions in the old
    * and the new document.
    */
  def getMap(): StepMap = js.native
  /**
    * Create an inverted version of this step. Needs the document as it
    * was before the step as argument.
    */
  def invert(doc: Node[S]): Step[S] = js.native
  /**
    * Map this step through a mappable thing, returning either a
    * version of that step with its positions adjusted, or `null` if
    * the step was entirely deleted by the mapping.
    */
  def map(mapping: Mappable): js.UndefOr[Step[S] | Null] = js.native
  /**
    * Try to merge this step with another one, to be applied directly
    * after it. Returns the merged step when possible, null if the
    * steps can't be merged.
    */
  def merge(other: Step[S]): js.UndefOr[Step[S] | Null] = js.native
  /**
    * Create a JSON-serializeable representation of this step. When
    * defining this for a custom subclass, make sure the result object
    * includes the step type's [JSON id](#transform.Step^jsonID) under
    * the `stepType` property.
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("prosemirror-transform", "Step")
@js.native
object Step extends js.Object {
  /**
    * Deserialize a step from its JSON representation. Will call
    * through to the step class' own implementation of this method.
    */
  def fromJSON[S /* <: Schema[_, _] */](schema: S, json: StringDictionary[js.Any]): Step[S] = js.native
  /**
    * To be able to serialize steps to JSON, each step needs a string
    * ID to attach to its JSON representation. Use this method to
    * register an ID for your step classes. Try to pick something
    * that's unlikely to clash with steps from other modules.
    */
  def jsonID(id: String, stepClass: Instantiable): Unit = js.native
}

