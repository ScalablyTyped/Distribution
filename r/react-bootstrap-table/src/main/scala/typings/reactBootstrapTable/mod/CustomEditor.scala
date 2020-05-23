package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEditor[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] extends js.Object {
  /**
    * Additional parameters to pass to the getElement function inside the props argument.
    */
  var customEditorParameters: js.UndefOr[js.Object] = js.undefined
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
  ): ReactElement
}

object CustomEditor {
  @scala.inline
  def apply[TRow, K](
    getElement: (js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
      Unit
    ], CustomEditorProps[TRow, K]) => ReactElement,
    customEditorParameters: js.Object = null
  ): CustomEditor[TRow, K] = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction2(getElement))
    if (customEditorParameters != null) __obj.updateDynamic("customEditorParameters")(customEditorParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEditor[TRow, K]]
  }
}

