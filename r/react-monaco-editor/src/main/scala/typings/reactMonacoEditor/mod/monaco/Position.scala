package typings.reactMonacoEditor.mod.monaco

import typings.monacoEditor.mod.IPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-monaco-editor", "monaco.Position")
@js.native
open class Position protected ()
  extends typings.monacoEditor.mod.Position {
  def this(lineNumber: Double, column: Double) = this()
}
/* static members */
object Position {
  
  @JSImport("react-monaco-editor", "monaco.Position")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A function that compares positions, useful for sorting
    */
  inline def compare(a: IPosition, b: IPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Test if position `a` equals position `b`
    */
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Null, b: IPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: IPosition): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: IPosition, b: IPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Test if position `a` is before position `b`.
    * If the two positions are equal, the result will be false.
    */
  inline def isBefore(a: IPosition, b: IPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBefore")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Test if position `a` is before position `b`.
    * If the two positions are equal, the result will be true.
    */
  inline def isBeforeOrEqual(a: IPosition, b: IPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBeforeOrEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Test if `obj` is an `IPosition`.
    */
  inline def isIPosition(obj: Any): /* is monaco-editor.monaco-editor.IPosition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPosition")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is monaco-editor.monaco-editor.IPosition */ Boolean]
  
  /**
    * Create a `Position` from an `IPosition`.
    */
  inline def lift(pos: IPosition): typings.monacoEditor.mod.Position = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(pos.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.Position]
}
