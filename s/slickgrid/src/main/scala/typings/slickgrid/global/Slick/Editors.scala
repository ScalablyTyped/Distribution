package typings.slickgrid.global.Slick

import typings.slickgrid.DOMEvent
import typings.slickgrid.Slick.Editors.EditorOptions
import typings.slickgrid.Slick.Position
import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Editors")
@js.native
object Editors extends js.Object {
  @js.native
  class Checkbox[T /* <: SlickData */] protected ()
    extends typings.slickgrid.Slick.Editors.Checkbox[T] {
    def this(args: EditorOptions[T]) = this()
    /* CompleteClass */
    override def applyValue(item: T, state: String): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def focus(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
    /* CompleteClass */
    override def isValueChanged(): Boolean = js.native
    /* CompleteClass */
    override def loadValue(item: T): Unit = js.native
    /* CompleteClass */
    override def serializeValue(): js.Any = js.native
    /* CompleteClass */
    override def validate(): ValidateResults = js.native
  }
  
  @js.native
  class Date[T /* <: SlickData */] protected ()
    extends typings.slickgrid.Slick.Editors.Date[T] {
    def this(args: EditorOptions[T]) = this()
    /* CompleteClass */
    override def applyValue(item: T, state: String): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def focus(): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
    /* CompleteClass */
    override def isValueChanged(): Boolean = js.native
    /* CompleteClass */
    override def loadValue(item: T): Unit = js.native
    /* CompleteClass */
    override def position(position: Position): Unit = js.native
    /* CompleteClass */
    override def serializeValue(): js.Any = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
    /* CompleteClass */
    override def validate(): ValidateResults = js.native
  }
  
  @js.native
  class Editor[T /* <: SlickData */] protected ()
    extends typings.slickgrid.Slick.Editors.Editor[T] {
    def this(args: EditorOptions[T]) = this()
    /* CompleteClass */
    override def applyValue(item: T, state: String): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def focus(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
    /* CompleteClass */
    override def isValueChanged(): Boolean = js.native
    /* CompleteClass */
    override def loadValue(item: T): Unit = js.native
    /* CompleteClass */
    override def serializeValue(): js.Any = js.native
    /* CompleteClass */
    override def validate(): ValidateResults = js.native
  }
  
  @js.native
  class Integer[T /* <: SlickData */] protected ()
    extends typings.slickgrid.Slick.Editors.Integer[T] {
    def this(args: EditorOptions[T]) = this()
    /* CompleteClass */
    override def applyValue(item: T, state: String): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def focus(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
    /* CompleteClass */
    override def isValueChanged(): Boolean = js.native
    /* CompleteClass */
    override def loadValue(item: T): Unit = js.native
    /* CompleteClass */
    override def serializeValue(): js.Any = js.native
    /* CompleteClass */
    override def validate(): ValidateResults = js.native
  }
  
  @js.native
  class LongText[T /* <: SlickData */] protected ()
    extends typings.slickgrid.Slick.Editors.LongText[T] {
    def this(args: EditorOptions[T]) = this()
    /* CompleteClass */
    override def applyValue(item: T, state: String): Unit = js.native
    /* CompleteClass */
    override def cancel(): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def focus(): Unit = js.native
    /* CompleteClass */
    override def handleKeyDown(e: DOMEvent): Unit = js.native
    /* CompleteClass */
    override def hide(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
    /* CompleteClass */
    override def isValueChanged(): Boolean = js.native
    /* CompleteClass */
    override def loadValue(item: T): Unit = js.native
    /* CompleteClass */
    override def position(position: Position): Unit = js.native
    /* CompleteClass */
    override def save(): Unit = js.native
    /* CompleteClass */
    override def serializeValue(): js.Any = js.native
    /* CompleteClass */
    override def show(): Unit = js.native
    /* CompleteClass */
    override def validate(): ValidateResults = js.native
  }
  
  @js.native
  class PercentComplete[T /* <: SlickData */] protected ()
    extends typings.slickgrid.Slick.Editors.PercentComplete[T] {
    def this(args: EditorOptions[T]) = this()
    /* CompleteClass */
    override def applyValue(item: T, state: String): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def focus(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
    /* CompleteClass */
    override def isValueChanged(): Boolean = js.native
    /* CompleteClass */
    override def loadValue(item: T): Unit = js.native
    /* CompleteClass */
    override def serializeValue(): js.Any = js.native
    /* CompleteClass */
    override def validate(): ValidateResults = js.native
  }
  
  @js.native
  class Text[T /* <: SlickData */] protected ()
    extends typings.slickgrid.Slick.Editors.Text[T] {
    def this(args: EditorOptions[T]) = this()
    /* CompleteClass */
    override def applyValue(item: T, state: String): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def focus(): Unit = js.native
    /* CompleteClass */
    override def getValue(): String = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
    /* CompleteClass */
    override def isValueChanged(): Boolean = js.native
    /* CompleteClass */
    override def loadValue(item: T): Unit = js.native
    /* CompleteClass */
    override def serializeValue(): js.Any = js.native
    /* CompleteClass */
    override def setValue(`val`: String): Unit = js.native
    /* CompleteClass */
    override def validate(): ValidateResults = js.native
  }
  
  @js.native
  class YesNoSelect[T /* <: SlickData */] protected ()
    extends typings.slickgrid.Slick.Editors.YesNoSelect[T] {
    def this(args: EditorOptions[T]) = this()
    /* CompleteClass */
    override def applyValue(item: T, state: String): Unit = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def focus(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
    /* CompleteClass */
    override def isValueChanged(): Boolean = js.native
    /* CompleteClass */
    override def loadValue(item: T): Unit = js.native
    /* CompleteClass */
    override def serializeValue(): js.Any = js.native
    /* CompleteClass */
    override def validate(): ValidateResults = js.native
  }
  
}

