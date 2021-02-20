package typings.pullStream

import typings.pullStream.anon.Last
import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import typings.pullStream.mod.SourceCallback
import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throughsMod {
  
  @JSImport("pull-stream/throughs", "asyncMap")
  @js.native
  def asyncMap[In, Out](fn: js.Function2[/* data */ In, /* cb */ SourceCallback[Out], _]): Through_[In, Out] = js.native
  
  @JSImport("pull-stream/throughs", "filter")
  @js.native
  def filter[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = js.native
  
  @JSImport("pull-stream/throughs", "filterNot")
  @js.native
  def filterNot[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = js.native
  
  @JSImport("pull-stream/throughs", "filter")
  @js.native
  def filter_InOut_In[In, Out /* <: In */](test: js.Function1[/* data */ In, /* is Out */ Boolean]): Through_[In, Out] = js.native
  
  @JSImport("pull-stream/throughs", "flatten")
  @js.native
  def flatten[Out](): Through_[js.Array[Out | Source[Out] | (Through_[_, Out])], Out] = js.native
  
  @JSImport("pull-stream/throughs", "map")
  @js.native
  def map[In, Out](fn: js.Function1[/* data */ In, Out]): Through_[In, Out] = js.native
  
  @JSImport("pull-stream/throughs", "nonUnique")
  @js.native
  def nonUnique[InOut](): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs", "nonUnique")
  @js.native
  def nonUnique[InOut](prop: /* keyof InOut */ String): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs", "nonUnique")
  @js.native
  def nonUnique[InOut](prop: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
  
  @JSImport("pull-stream/throughs", "take")
  @js.native
  def take[InOut](n: Double): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs", "take")
  @js.native
  def take[InOut](testFn: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs", "take")
  @js.native
  def take[InOut](testFn: js.Function1[/* data */ InOut, Boolean], opts: Last): Through_[InOut, InOut] = js.native
  
  @JSImport("pull-stream/throughs", "through")
  @js.native
  def through[InOut](): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs", "through")
  @js.native
  def through[InOut](op: js.UndefOr[scala.Nothing], onEnd: js.Function1[/* err */ EndOrError, _]): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs", "through")
  @js.native
  def through[InOut](op: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs", "through")
  @js.native
  def through[InOut](op: js.Function1[/* data */ InOut, _], onEnd: js.Function1[/* err */ EndOrError, _]): Through_[InOut, InOut] = js.native
  
  @JSImport("pull-stream/throughs", "unique")
  @js.native
  def unique[InOut](): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs", "unique")
  @js.native
  def unique[InOut](prop: /* keyof InOut */ String): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs", "unique")
  @js.native
  def unique[InOut](prop: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
}
