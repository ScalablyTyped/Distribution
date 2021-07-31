package typings.pullStream

import typings.pullStream.anon.Last
import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import typings.pullStream.mod.SourceCallback
import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throughsMod {
  
  @JSImport("pull-stream/throughs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def asyncMap[In, Out](fn: js.Function2[/* data */ In, /* cb */ SourceCallback[Out], js.Any]): Through_[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncMap")(fn.asInstanceOf[js.Any]).asInstanceOf[Through_[In, Out]]
  
  @scala.inline
  def filter[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  
  @scala.inline
  def filterNot[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterNot")(test.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  
  @scala.inline
  def filter_InOut_In[In, Out /* <: In */](test: js.Function1[/* data */ In, /* is Out */ Boolean]): Through_[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(test.asInstanceOf[js.Any]).asInstanceOf[Through_[In, Out]]
  
  @scala.inline
  def flatten[Out](): Through_[js.Array[Out | Source[Out] | (Through_[js.Any, Out])], Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[Through_[js.Array[Out | Source[Out] | (Through_[js.Any, Out])], Out]]
  
  @scala.inline
  def map[In, Out](fn: js.Function1[/* data */ In, Out]): Through_[In, Out] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(fn.asInstanceOf[js.Any]).asInstanceOf[Through_[In, Out]]
  
  @scala.inline
  def nonUnique[InOut](): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonUnique")().asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def nonUnique[InOut](prop: /* keyof InOut */ String): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonUnique")(prop.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def nonUnique[InOut](prop: js.Function1[/* data */ InOut, js.Any]): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonUnique")(prop.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  
  @scala.inline
  def take[InOut](n: Double): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def take[InOut](testFn: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(testFn.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def take[InOut](testFn: js.Function1[/* data */ InOut, Boolean], opts: Last): Through_[InOut, InOut] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(testFn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Through_[InOut, InOut]]
  
  @scala.inline
  def through[InOut](): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("through")().asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def through[InOut](op: js.Function1[/* data */ InOut, js.Any]): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("through")(op.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def through[InOut](op: js.Function1[/* data */ InOut, js.Any], onEnd: js.Function1[/* err */ EndOrError, js.Any]): Through_[InOut, InOut] = (^.asInstanceOf[js.Dynamic].applyDynamic("through")(op.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def through[InOut](op: Unit, onEnd: js.Function1[/* err */ EndOrError, js.Any]): Through_[InOut, InOut] = (^.asInstanceOf[js.Dynamic].applyDynamic("through")(op.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[Through_[InOut, InOut]]
  
  @scala.inline
  def unique[InOut](): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")().asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def unique[InOut](prop: /* keyof InOut */ String): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(prop.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def unique[InOut](prop: js.Function1[/* data */ InOut, js.Any]): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(prop.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
}
