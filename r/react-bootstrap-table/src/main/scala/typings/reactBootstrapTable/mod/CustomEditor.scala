package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomEditor[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] extends StObject {
  
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
  def apply[TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */](
    getElement: (js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
      Unit
    ], CustomEditorProps[TRow, K]) => ReactElement
  ): CustomEditor[TRow, K] = {
    val __obj = js.Dynamic.literal(getElement = js.Any.fromFunction2(getElement))
    __obj.asInstanceOf[CustomEditor[TRow, K]]
  }
  
  @scala.inline
  implicit class CustomEditorMutableBuilder[Self <: CustomEditor[_, _], TRow /* <: js.Object */, K /* <: /* keyof TRow */ String */] (val x: Self with (CustomEditor[TRow, K])) extends AnyVal {
    
    @scala.inline
    def setCustomEditorParameters(value: js.Object): Self = StObject.set(x, "customEditorParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEditorParametersUndefined: Self = StObject.set(x, "customEditorParameters", js.undefined)
    
    @scala.inline
    def setGetElement(
      value: (js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
          Unit
        ], CustomEditorProps[TRow, K]) => ReactElement
    ): Self = StObject.set(x, "getElement", js.Any.fromFunction2(value))
  }
}
