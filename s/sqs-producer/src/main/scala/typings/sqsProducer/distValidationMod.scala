package typings.sqsProducer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distValidationMod {
  
  @JSImport("sqs-producer/dist/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMessageAttributeValid(messageAttribute: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMessageAttributeValid")(messageAttribute.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
