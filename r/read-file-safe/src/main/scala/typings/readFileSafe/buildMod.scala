package typings.readFileSafe

import typings.readFileSafe.readFileSafeBooleans.`false`
import typings.readFileSafe.readFileSafeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("read-file-safe/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readFile[T /* <: Args */](
    path: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type T is not an array type */ param1: T
  ): js.Promise[ReturnValue[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValue[T]]]
  
  inline def readFileSync[T /* <: Args */](
    path: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param <destructured> because its type T is not an array type */ param1: T
  ): ReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ReturnValue[T]]
  
  type Args = StringArgs | BufferArgs
  
  type BufferArgs = js.Array[/* options */ Options[`true`]]
  
  trait Options[T /* <: Boolean */] extends StObject {
    
    /**
      * Return content as a Buffer. Default: `false`
      */
    var buffer: js.UndefOr[T] = js.undefined
  }
  object Options {
    
    inline def apply[T /* <: Boolean */](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], T /* <: Boolean */] (val x: Self & Options[T]) extends AnyVal {
      
      inline def setBuffer(value: T): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends read-file-safe.read-file-safe/build.StringArgs ? string : node.buffer.<global>.Buffer
    }}}
    */
  type ReturnContent[T] = String
  
  type ReturnValue[T] = js.UndefOr[ReturnContent[T]]
  
  type StringArgs = js.Array[/* options */ js.UndefOr[Options[`false`]]]
}
