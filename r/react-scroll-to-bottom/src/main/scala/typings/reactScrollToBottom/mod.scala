package typings.reactScrollToBottom

import typings.react.mod.Context
import typings.reactScrollToBottom.anon.Animating
import typings.reactScrollToBottom.anon.PropsWithChildrencheckInt
import typings.reactScrollToBottom.anon.ScrollTo
import typings.reactScrollToBottom.anon.ScrollTop
import typings.reactScrollToBottom.reactScrollToBottomBooleans.`false`
import typings.reactScrollToBottom.reactScrollToBottomStrings.`100Percentsign`
import typings.reactScrollToBottom.reactScrollToBottomStrings.bottom
import typings.reactScrollToBottom.reactScrollToBottomStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scroll-to-bottom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: PropsWithChildrencheckInt): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("react-scroll-to-bottom", "FunctionContext")
  @js.native
  val FunctionContext: Context[ScrollTo] = js.native
  
  @JSImport("react-scroll-to-bottom", "StateContext")
  @js.native
  val StateContext: Context[Animating] = js.native
  
  inline def useAnimating(): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimating")().asInstanceOf[js.Array[Boolean]]
  
  inline def useAnimatingToEnd(): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatingToEnd")().asInstanceOf[js.Array[Boolean]]
  
  inline def useAtBottom(): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtBottom")().asInstanceOf[js.Array[Boolean]]
  
  inline def useAtEnd(): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtEnd")().asInstanceOf[js.Array[Boolean]]
  
  inline def useAtStart(): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtStart")().asInstanceOf[js.Array[Boolean]]
  
  inline def useAtTop(): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtTop")().asInstanceOf[js.Array[Boolean]]
  
  inline def useMode(): js.Array[bottom | top] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMode")().asInstanceOf[js.Array[bottom | top]]
  
  inline def useObserveScrollPosition(observer: js.Function1[/* hasScrollTop */ ScrollTop, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useObserveScrollPosition")(observer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useObserveScrollPosition_false(observer: `false`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useObserveScrollPosition")(observer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useScrollTo(): js.Function1[/* scrollTop */ Double | `100Percentsign`, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollTo")().asInstanceOf[js.Function1[/* scrollTop */ Double | `100Percentsign`, Unit]]
  
  inline def useScrollToBottom(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollToBottom")().asInstanceOf[js.Function0[Unit]]
  
  inline def useScrollToEnd(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollToEnd")().asInstanceOf[js.Function0[Unit]]
  
  inline def useScrollToStart(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollToStart")().asInstanceOf[js.Function0[Unit]]
  
  inline def useScrollToTop(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollToTop")().asInstanceOf[js.Function0[Unit]]
  
  inline def useSticky(): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSticky")().asInstanceOf[js.Array[Boolean]]
}
