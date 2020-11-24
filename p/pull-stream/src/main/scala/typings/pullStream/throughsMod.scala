package typings.pullStream

import typings.pullStream.anon.Last
import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import typings.pullStream.mod.SourceCallback
import typings.pullStream.mod.Through_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pull-stream/throughs", JSImport.Namespace)
@js.native
object throughsMod extends js.Object {
  
  @js.native
  object asyncMap extends js.Object {
    
    def apply[In, Out](fn: js.Function2[/* data */ In, /* cb */ SourceCallback[Out], _]): Through_[In, Out] = js.native
  }
  
  @js.native
  object filter extends js.Object {
    
    def apply[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = js.native
  }
  
  @js.native
  object filterNot extends js.Object {
    
    def apply[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = js.native
  }
  
  @js.native
  object flatten extends js.Object {
    
    def apply[Out](): Through_[js.Array[Out | Source[Out] | (Through_[_, Out])], Out] = js.native
  }
  
  @js.native
  object map extends js.Object {
    
    def apply[In, Out](fn: js.Function1[/* data */ In, Out]): Through_[In, Out] = js.native
  }
  
  @js.native
  object nonUnique extends js.Object {
    
    def apply[InOut](): Through_[InOut, InOut] = js.native
    def apply[InOut](prop: /* keyof InOut */ String): Through_[InOut, InOut] = js.native
    def apply[InOut](prop: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
  }
  
  @js.native
  object take extends js.Object {
    
    def apply[InOut](n: Double): Through_[InOut, InOut] = js.native
    def apply[InOut](testFn: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = js.native
    def apply[InOut](testFn: js.Function1[/* data */ InOut, Boolean], opts: Last): Through_[InOut, InOut] = js.native
  }
  
  @js.native
  object through extends js.Object {
    
    def apply[InOut](): Through_[InOut, InOut] = js.native
    def apply[InOut](op: js.UndefOr[scala.Nothing], onEnd: js.Function1[/* err */ EndOrError, _]): Through_[InOut, InOut] = js.native
    def apply[InOut](op: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
    def apply[InOut](op: js.Function1[/* data */ InOut, _], onEnd: js.Function1[/* err */ EndOrError, _]): Through_[InOut, InOut] = js.native
  }
  
  @js.native
  object unique extends js.Object {
    
    def apply[InOut](): Through_[InOut, InOut] = js.native
    def apply[InOut](prop: /* keyof InOut */ String): Through_[InOut, InOut] = js.native
    def apply[InOut](prop: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
  }
}
