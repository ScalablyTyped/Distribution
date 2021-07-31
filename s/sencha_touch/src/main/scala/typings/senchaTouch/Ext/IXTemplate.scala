package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXTemplate
  extends StObject
     with ITemplate {
  
  /** [Method] Appends the result of this template to the provided output array
    * @param values Object/Array The template values. See apply.
    * @param out Array The array to which output is pushed.
    * @param parent Object
    * @returns Array The given out array.
    */
  @JSName("applyOut")
  var applyOut_IXTemplate: js.UndefOr[
    js.Function3[
      /* values */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[Array], 
      /* parent */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.undefined
}
object IXTemplate {
  
  @scala.inline
  def apply(): IXTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXTemplate]
  }
  
  @scala.inline
  implicit class IXTemplateMutableBuilder[Self <: IXTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyOut(
      value: (/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array], /* parent */ js.UndefOr[js.Any]) => Array
    ): Self = StObject.set(x, "applyOut", js.Any.fromFunction3(value))
    
    @scala.inline
    def setApplyOutUndefined: Self = StObject.set(x, "applyOut", js.undefined)
  }
}
