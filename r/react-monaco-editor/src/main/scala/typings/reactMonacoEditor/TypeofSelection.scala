package typings.reactMonacoEditor

import org.scalablytyped.runtime.Instantiable4
import typings.monacoEditor.mod.IPosition
import typings.monacoEditor.mod.ISelection
import typings.monacoEditor.mod.Selection
import typings.monacoEditor.mod.SelectionDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSelection extends Instantiable4[
      /* selectionStartLineNumber */ Double, 
      /* selectionStartColumn */ Double, 
      /* positionLineNumber */ Double, 
      /* positionColumn */ Double, 
      Selection
    ] {
  /**
    * Create with a direction.
    */
  def createWithDirection(
    startLineNumber: Double,
    startColumn: Double,
    endLineNumber: Double,
    endColumn: Double,
    direction: SelectionDirection
  ): Selection = js.native
  /**
    * Create a `Selection` from one or two positions
    */
  def fromPositions(start: IPosition): Selection = js.native
  def fromPositions(start: IPosition, end: IPosition): Selection = js.native
  /**
    * Test if `obj` is an `ISelection`.
    */
  def isISelection(obj: js.Any): /* is monaco-editor.monaco-editor.ISelection */ Boolean = js.native
  /**
    * Create a `Selection` from an `ISelection`.
    */
  def liftSelection(sel: ISelection): Selection = js.native
  /**
    * `a` equals `b`.
    */
  def selectionsArrEqual(a: js.Array[ISelection], b: js.Array[ISelection]): Boolean = js.native
  /**
    * Test if the two selections are equal.
    */
  def selectionsEqual(a: ISelection, b: ISelection): Boolean = js.native
}

