package typings.rxDom.mod

import typings.rx.Rx.internals.NotImplementedError
import typings.rx.Rx.internals.NotSupportedError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpers {
  
  @JSImport("rx-dom", "helpers")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rx-dom", "helpers.asArray")
  @js.native
  def asArray: js.Function1[/* repeated */ js.Any, js.Array[js.Any]] = js.native
  @scala.inline
  def asArray_=(x: js.Function1[/* repeated */ js.Any, js.Array[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asArray")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.defaultComparer")
  @js.native
  def defaultComparer: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean] = js.native
  @scala.inline
  def defaultComparer_=(x: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultComparer")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.defaultError")
  @js.native
  def defaultError: js.Function1[/* err */ js.Any, Unit] = js.native
  @scala.inline
  def defaultError_=(x: js.Function1[/* err */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultError")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.defaultKeySerializer")
  @js.native
  def defaultKeySerializer: js.Function1[/* key */ js.Any, String] = js.native
  @scala.inline
  def defaultKeySerializer_=(x: js.Function1[/* key */ js.Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultKeySerializer")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.defaultNow")
  @js.native
  def defaultNow: js.Function0[Double] = js.native
  @scala.inline
  def defaultNow_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultNow")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.defaultSubComparer")
  @js.native
  def defaultSubComparer: js.Function2[/* left */ js.Any, /* right */ js.Any, Double] = js.native
  @scala.inline
  def defaultSubComparer_=(x: js.Function2[/* left */ js.Any, /* right */ js.Any, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSubComparer")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.identity")
  @js.native
  def identity: js.Function1[/* value */ js.Any, js.Any] = js.native
  @scala.inline
  def identity_=(x: js.Function1[/* value */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.isFunction")
  @js.native
  def isFunction: js.Function1[/* value */ js.Any, Boolean] = js.native
  @scala.inline
  def isFunction_=(x: js.Function1[/* value */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFunction")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.isPromise")
  @js.native
  def isPromise: js.Function1[/* p */ js.Any, Boolean] = js.native
  @scala.inline
  def isPromise_=(x: js.Function1[/* p */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isPromise")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.noop")
  @js.native
  def noop: js.Function0[Unit] = js.native
  @scala.inline
  def noop_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noop")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.not")
  @js.native
  def not: js.Function1[/* value */ js.Any, Boolean] = js.native
  
  @JSImport("rx-dom", "helpers.notDefined")
  @js.native
  def notDefined: js.Function1[/* value */ js.Any, Boolean] = js.native
  @scala.inline
  def notDefined_=(x: js.Function1[/* value */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notDefined")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.notImplemented")
  @js.native
  def notImplemented: js.Function0[NotImplementedError] = js.native
  @scala.inline
  def notImplemented_=(x: js.Function0[NotImplementedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notImplemented")(x.asInstanceOf[js.Any])
  
  @JSImport("rx-dom", "helpers.notSupported")
  @js.native
  def notSupported: js.Function0[NotSupportedError] = js.native
  @scala.inline
  def notSupported_=(x: js.Function0[NotSupportedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notSupported")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def not_=(x: js.Function1[/* value */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("not")(x.asInstanceOf[js.Any])
}
