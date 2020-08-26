package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEditor[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] extends js.Object {
  /**
    * Additional parameters to pass to the getElement function inside the props argument.
    */
  var customEditorParameters: js.UndefOr[js.Object] = js.native
  /**
    * Required. Function to use to create the custom cell editor. Takes two parameters:
    *   `onUpdate`: callback function to call to update the value inside the cell.
    *   `props`:
    */
  def getElement(
    onUpdate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
      Unit
    ],
    props: CustomEditorProps[TRow, K]
  ): ReactElement = js.native
}

object CustomEditor {
  @scala.inline
  def apply[/* <: js.Object */ TRow, /* <: / * keyof TRow * / java.lang.String */ K](
    getElement: (js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
      Unit
    ], CustomEditorProps[TRow, K]) => ReactElement
  ): CustomEditor[TRow, K] = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction2(getElement))
    __obj.asInstanceOf[CustomEditor[TRow, K]]
  }
  @scala.inline
  implicit class CustomEditorOps[Self <: CustomEditor[_, _], /* <: js.Object */ TRow, /* <: / * keyof TRow * / java.lang.String */ K] (val x: Self with (CustomEditor[TRow, K])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetElement(
      value: (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
          Unit
        ], CustomEditorProps[TRow, K]) => ReactElement
    ): Self = this.set("getElement", js.Any.fromFunction2(value))
    @scala.inline
    def setCustomEditorParameters(value: js.Object): Self = this.set("customEditorParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomEditorParameters: Self = this.set("customEditorParameters", js.undefined)
  }
  
}

