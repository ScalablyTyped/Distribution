package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEditor[TRow /* <: js.Object */, K /* <: java.lang.String */] extends js.Object {
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
      /* import warning: ImportType.apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
      scala.Unit
    ],
    props: CustomEditorProps[TRow, K]
  ): reactLib.reactMod.ReactNs.ReactElement[_]
}

object CustomEditor {
  @scala.inline
  def apply[TRow /* <: js.Object */, K /* <: java.lang.String */](
    getElement: js.Function2[
      js.Function1[
        /* import warning: ImportType.apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
        scala.Unit
      ], 
      CustomEditorProps[TRow, K], 
      reactLib.reactMod.ReactNs.ReactElement[_]
    ],
    customEditorParameters: js.Object = null
  ): CustomEditor[TRow, K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getElement")(getElement)
    if (customEditorParameters != null) __obj.updateDynamic("customEditorParameters")(customEditorParameters)
    __obj.asInstanceOf[CustomEditor[TRow, K]]
  }
}

