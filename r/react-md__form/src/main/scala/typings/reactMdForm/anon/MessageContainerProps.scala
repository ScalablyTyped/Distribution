package typings.reactMdForm.anon

import typings.reactMdForm.formMessageContainerMod.MessageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageContainerProps extends StObject {
  
  /**
    * Any props (and an optional ref) to provide to the `<div>` surrounding the
    * children and `FormMessage` component.
    *
    * Note: This will not be used if the `messageProps` are not provided since
    * only the `children` will be returned without the container.
    */
  var messageContainerProps: js.UndefOr[typings.reactMdForm.formMessageContainerMod.MessageContainerProps] = js.undefined
  
  /**
    * If the extension doesn't actually want to render the `FormMessage`
    * component, these props are optional. It kind of eliminates the whole
    * purpose of this component though.
    */
  var messageProps: js.UndefOr[MessageProps] = js.undefined
}
object MessageContainerProps {
  
  inline def apply(): MessageContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContainerProps]
  }
  
  extension [Self <: MessageContainerProps](x: Self) {
    
    inline def setMessageContainerProps(value: typings.reactMdForm.formMessageContainerMod.MessageContainerProps): Self = StObject.set(x, "messageContainerProps", value.asInstanceOf[js.Any])
    
    inline def setMessageContainerPropsUndefined: Self = StObject.set(x, "messageContainerProps", js.undefined)
    
    inline def setMessageProps(value: MessageProps): Self = StObject.set(x, "messageProps", value.asInstanceOf[js.Any])
    
    inline def setMessagePropsUndefined: Self = StObject.set(x, "messageProps", js.undefined)
  }
}
