package typings.reactDashSketchapp.reactDashSketchappMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashSketchapp.Anon_Style
import typings.reactDashSketchapp.reactDashSketchappNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp", "StyleSheet")
@js.native
object StyleSheet extends js.Object {
  var absoluteFill: StyleReference = js.native
  var hairlineWidth: `1` = js.native
  /**
    * Create an optimized `StyleSheet` reference from a style object.
    */
  def create[T /* <: StringDictionary[Style | TextStyle] */](t: T): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: react-sketchapp.react-sketchapp.StyleReference}
    */ typings.reactDashSketchapp.reactDashSketchappStrings.StyleSheet with js.Any = js.native
  def flatten(): Style | TextStyle = js.native
  /**
    * Flatten an array of style objects into one aggregated object, or look up the definition for a
    * registered stylesheet.
    */
  def flatten(input: js.Array[Style | TextStyle | StyleReference]): Style | TextStyle = js.native
  def flatten(input: Style): Style | TextStyle = js.native
  def flatten(input: StyleReference): Style | TextStyle = js.native
   // returns the expanded style or expanded style reference which conforms
  // to the `Style | TextStyle` interface
  /**
    * resolve one style
    */
  def resolve(style: Style): Anon_Style = js.native
  def resolve(style: TextStyle): Anon_Style = js.native
}

