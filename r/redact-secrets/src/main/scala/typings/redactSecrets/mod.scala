package typings.redactSecrets

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a redactor instance.
    *
    * @param redacted The string used as a replacement variable for values that are redacted.
    *
    * @example
    * const makeRedact = require('redact-secrets')
    *
    * const redact = makeRedact('[REDACTED]')
    *
    * const obj = {
    *   username: 'watson',
    *   password: 'hhGu38gf',
    *   extra: {
    *     id: 1,
    *     token: 'some-secret-stuff'
    *     card: '1234 1234 1234 1234'
    *   }
    * }
    *
    * console.log(redact.map(obj))
    * // {
    * //   username: 'watson',
    * //   password: '[REDACTED]',
    * //   extra: {
    * //     id: 1,
    * //     token: '[REDACTED]'
    * //     card: '[REDACTED]'
    * //   }
    * // }
    */
  inline def apply(redacted: String): Redactor = ^.asInstanceOf[js.Dynamic].apply(redacted.asInstanceOf[js.Any]).asInstanceOf[Redactor]
  
  @JSImport("redact-secrets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Redactor extends StObject {
    
    /**
      * Redacts the secret values of the `obj` in-place.
      *
      * @param obj The object to redact.
      */
    def forEach(obj: Record[String, Any]): Unit
    
    /**
      * @param obj The object to redact.
      * @returns A clone of the given `obj` with its secret values redacted.
      */
    def map[TObj /* <: Record[String, Any] */](obj: TObj): TObj
  }
  object Redactor {
    
    inline def apply(forEach: Record[String, Any] => Unit, map: Any => Any): Redactor = {
      val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach), map = js.Any.fromFunction1(map))
      __obj.asInstanceOf[Redactor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Redactor] (val x: Self) extends AnyVal {
      
      inline def setForEach(value: Record[String, Any] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setMap(value: Any => Any): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    }
  }
}
