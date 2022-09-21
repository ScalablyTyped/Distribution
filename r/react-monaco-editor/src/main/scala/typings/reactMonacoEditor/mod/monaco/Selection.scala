package typings.reactMonacoEditor.mod.monaco

import typings.monacoEditor.mod.IPosition
import typings.monacoEditor.mod.ISelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-monaco-editor", "monaco.Selection")
@js.native
open class Selection protected ()
  extends typings.monacoEditor.mod.Selection {
  def this(
    selectionStartLineNumber: Double,
    selectionStartColumn: Double,
    positionLineNumber: Double,
    positionColumn: Double
  ) = this()
}
/* static members */
object Selection {
  
  @JSImport("react-monaco-editor", "monaco.Selection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create with a direction.
    */
  inline def createWithDirection(
    startLineNumber: Double,
    startColumn: Double,
    endLineNumber: Double,
    endColumn: Double,
    direction: typings.monacoEditor.mod.SelectionDirection
  ): typings.monacoEditor.mod.Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("createWithDirection")(startLineNumber.asInstanceOf[js.Any], startColumn.asInstanceOf[js.Any], endLineNumber.asInstanceOf[js.Any], endColumn.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.Selection]
  
  /**
    * Create a `Selection` from one or two positions
    */
  inline def fromPositions(start: IPosition): typings.monacoEditor.mod.Selection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(start.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.Selection]
  inline def fromPositions(start: IPosition, end: IPosition): typings.monacoEditor.mod.Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.Selection]
  
  /**
    * Creates a `Selection` from a range, given a direction.
    */
  inline def fromRange(range: typings.monacoEditor.mod.Range, direction: typings.monacoEditor.mod.SelectionDirection): typings.monacoEditor.mod.Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRange")(range.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.Selection]
  
  /**
    * Test if `obj` is an `ISelection`.
    */
  inline def isISelection(obj: Any): /* is monaco-editor.monaco-editor.ISelection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISelection")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is monaco-editor.monaco-editor.ISelection */ Boolean]
  
  /**
    * Create a `Selection` from an `ISelection`.
    */
  inline def liftSelection(sel: ISelection): typings.monacoEditor.mod.Selection = ^.asInstanceOf[js.Dynamic].applyDynamic("liftSelection")(sel.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.Selection]
  
  /**
    * `a` equals `b`.
    */
  inline def selectionsArrEqual(a: js.Array[ISelection], b: js.Array[ISelection]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectionsArrEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Test if the two selections are equal.
    */
  inline def selectionsEqual(a: ISelection, b: ISelection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectionsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
