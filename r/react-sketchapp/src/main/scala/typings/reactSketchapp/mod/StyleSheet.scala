package typings.reactSketchapp.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.reactSketchapp.reactSketchappNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleSheet {
  
  @JSImport("react-sketchapp", "StyleSheet")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp", "StyleSheet.absoluteFill")
  @js.native
  def absoluteFill: StyleReference = js.native
  inline def absoluteFill_=(x: StyleReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("absoluteFill")(x.asInstanceOf[js.Any])
  
  /**
    * Create an optimized `StyleSheet` reference from a style object.
    */
  inline def create[T /* <: StringDictionary[Style | TextStyle] */](t: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: react-sketchapp.react-sketchapp.StyleReference}
    */ typings.reactSketchapp.reactSketchappStrings.create & TopLevel[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(t.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: react-sketchapp.react-sketchapp.StyleReference}
    */ typings.reactSketchapp.reactSketchappStrings.create & TopLevel[js.Any]]
  
  /**
    * Flatten an array of style objects into one aggregated object, or look up the definition for a
    * registered stylesheet.
    */
  inline def flatten(): Style | TextStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[Style | TextStyle]
  inline def flatten(input: js.Array[Style | TextStyle | StyleReference]): Style | TextStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[Style | TextStyle]
  inline def flatten(input: Style): Style | TextStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[Style | TextStyle]
  inline def flatten(input: StyleReference): Style | TextStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(input.asInstanceOf[js.Any]).asInstanceOf[Style | TextStyle]
  
  @JSImport("react-sketchapp", "StyleSheet.hairlineWidth")
  @js.native
  def hairlineWidth: `1` = js.native
  inline def hairlineWidth_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hairlineWidth")(x.asInstanceOf[js.Any])
  
  // returns the expanded style or expanded style reference which conforms
  // to the `Style | TextStyle` interface
  /**
    * resolve one style
    */
  inline def resolve(style: Style): typings.reactSketchapp.anon.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(style.asInstanceOf[js.Any]).asInstanceOf[typings.reactSketchapp.anon.Style]
  inline def resolve(style: TextStyle): typings.reactSketchapp.anon.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(style.asInstanceOf[js.Any]).asInstanceOf[typings.reactSketchapp.anon.Style]
}
