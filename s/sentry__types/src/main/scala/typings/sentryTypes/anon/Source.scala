package typings.sentryTypes.anon

import typings.sentryTypes.typesTransactionMod.TransactionSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  var source: TransactionSource
}
object Source {
  
  inline def apply(source: TransactionSource): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setSource(value: TransactionSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
