package typings.reactSketchapp.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.reactSketchapp.reactSketchappNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleSheet {
  
  @JSImport("react-sketchapp", "StyleSheet")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp", "StyleSheet.absoluteFill")
  @js.native
  def absoluteFill: StyleReference = js.native
  @scala.inline
  def absoluteFill_=(x: StyleReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("absoluteFill")(x.asInstanceOf[js.Any])
  
  /**
    * Create an optimized `StyleSheet` reference from a style object.
    */
  @JSImport("react-sketchapp", "StyleSheet.create")
  @js.native
  def create[T /* <: StringDictionary[Style | TextStyle] */](t: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: react-sketchapp.react-sketchapp.StyleReference}
    */ typings.reactSketchapp.reactSketchappStrings.create with TopLevel[js.Any] = js.native
  
  /**
    * Flatten an array of style objects into one aggregated object, or look up the definition for a
    * registered stylesheet.
    */
  @JSImport("react-sketchapp", "StyleSheet.flatten")
  @js.native
  def flatten(): Style | TextStyle = js.native
  @JSImport("react-sketchapp", "StyleSheet.flatten")
  @js.native
  def flatten(input: js.Array[Style | TextStyle | StyleReference]): Style | TextStyle = js.native
  @JSImport("react-sketchapp", "StyleSheet.flatten")
  @js.native
  def flatten(input: Style): Style | TextStyle = js.native
  @JSImport("react-sketchapp", "StyleSheet.flatten")
  @js.native
  def flatten(input: StyleReference): Style | TextStyle = js.native
  
  @JSImport("react-sketchapp", "StyleSheet.hairlineWidth")
  @js.native
  def hairlineWidth: `1` = js.native
  @scala.inline
  def hairlineWidth_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hairlineWidth")(x.asInstanceOf[js.Any])
  
  // returns the expanded style or expanded style reference which conforms
  // to the `Style | TextStyle` interface
  /**
    * resolve one style
    */
  @JSImport("react-sketchapp", "StyleSheet.resolve")
  @js.native
  def resolve(style: Style): typings.reactSketchapp.anon.Style = js.native
  @JSImport("react-sketchapp", "StyleSheet.resolve")
  @js.native
  def resolve(style: TextStyle): typings.reactSketchapp.anon.Style = js.native
}
