package typings.storageHelper

import typings.std.NonNullable
import typings.storageHelper.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("storage-helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("storage-helper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    @JSImport("storage-helper", "default.clear")
    @js.native
    def clear_Fdefault: js.Function0[Unit] = js.native
    
    @scala.inline
    def clear_Fdefault_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSImport("storage-helper", "default.getItem")
    @js.native
    def getItem: FnCall = js.native
    @scala.inline
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String): String | NonNullable[U] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any]).asInstanceOf[String | NonNullable[U] | Null]
    @scala.inline
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T): String | NonNullable[U] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[String | NonNullable[U] | Null]
    @scala.inline
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T, fallback: U): String | NonNullable[U] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], parse.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String | NonNullable[U] | Null]
    @scala.inline
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: Unit, fallback: U): String | NonNullable[U] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], parse.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String | NonNullable[U] | Null]
    @scala.inline
    def getItem_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItem")(x.asInstanceOf[js.Any])
    
    @JSImport("storage-helper", "default.removeItem")
    @js.native
    def removeItem: js.Function1[/* key */ String, Unit] = js.native
    @scala.inline
    def removeItem(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def removeItem_=(x: js.Function1[/* key */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(x.asInstanceOf[js.Any])
    
    @JSImport("storage-helper", "default.setItem")
    @js.native
    def setItem: js.Function3[/* key */ String, /* value */ String, /* permanent */ js.UndefOr[Boolean], Unit] = js.native
    @scala.inline
    def setItem(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def setItem(key: String, value: String, permanent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], permanent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def setItem_=(x: js.Function3[/* key */ String, /* value */ String, /* permanent */ js.UndefOr[Boolean], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setItem")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  @scala.inline
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String): String | NonNullable[U] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any]).asInstanceOf[String | NonNullable[U] | Null]
  @scala.inline
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T): String | NonNullable[U] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[String | NonNullable[U] | Null]
  @scala.inline
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T, fallback: U): String | NonNullable[U] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], parse.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String | NonNullable[U] | Null]
  @scala.inline
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: Unit, fallback: U): String | NonNullable[U] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], parse.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String | NonNullable[U] | Null]
  
  @scala.inline
  def removeItem(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setItem(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setItem(key: String, value: String, permanent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], permanent.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def showStorageLogger(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showStorageLogger")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
