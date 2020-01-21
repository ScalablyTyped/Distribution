package typings.reactMonacoEditor

import org.scalablytyped.runtime.Instantiable2
import typings.monacoEditor.mod.IPosition
import typings.monacoEditor.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassPosition extends Instantiable2[/* lineNumber */ Double, /* column */ Double, Position] {
  /**
    * A function that compares positions, useful for sorting
    */
  def compare(a: IPosition, b: IPosition): Double = js.native
  def equals(): Boolean = js.native
  def equals(a: Null, b: IPosition): Boolean = js.native
  def equals(a: IPosition): Boolean = js.native
  /**
    * Test if position `a` equals position `b`
    */
  def equals(a: IPosition, b: IPosition): Boolean = js.native
  /**
    * Test if position `a` is before position `b`.
    * If the two positions are equal, the result will be false.
    */
  def isBefore(a: IPosition, b: IPosition): Boolean = js.native
  /**
    * Test if position `a` is before position `b`.
    * If the two positions are equal, the result will be true.
    */
  def isBeforeOrEqual(a: IPosition, b: IPosition): Boolean = js.native
  /**
    * Test if `obj` is an `IPosition`.
    */
  def isIPosition(obj: js.Any): /* is monaco-editor.monaco-editor.IPosition */ Boolean = js.native
  /**
    * Create a `Position` from an `IPosition`.
    */
  def lift(pos: IPosition): Position = js.native
}

