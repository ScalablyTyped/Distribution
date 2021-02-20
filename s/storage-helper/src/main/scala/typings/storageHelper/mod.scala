package typings.storageHelper

import typings.std.NonNullable
import typings.storageHelper.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("storage-helper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("storage-helper", "default.clear")
    @js.native
    def clear(): Unit = js.native
    @JSImport("storage-helper", "default.clear")
    @js.native
    def clear_Fdefault: js.Function0[Unit] = js.native
    
    @scala.inline
    def clear_Fdefault_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSImport("storage-helper", "default.getItem")
    @js.native
    def getItem: FnCall = js.native
    @JSImport("storage-helper", "default.getItem")
    @js.native
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String): String | NonNullable[U] | Null = js.native
    @JSImport("storage-helper", "default.getItem")
    @js.native
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T): String | NonNullable[U] | Null = js.native
    @JSImport("storage-helper", "default.getItem")
    @js.native
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T, fallback: U): String | NonNullable[U] | Null = js.native
    @JSImport("storage-helper", "default.getItem")
    @js.native
    def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: js.UndefOr[scala.Nothing], fallback: U): String | NonNullable[U] | Null = js.native
    @scala.inline
    def getItem_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItem")(x.asInstanceOf[js.Any])
    
    @JSImport("storage-helper", "default.removeItem")
    @js.native
    def removeItem: js.Function1[/* key */ String, Unit] = js.native
    @JSImport("storage-helper", "default.removeItem")
    @js.native
    def removeItem(key: String): Unit = js.native
    @scala.inline
    def removeItem_=(x: js.Function1[/* key */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(x.asInstanceOf[js.Any])
    
    @JSImport("storage-helper", "default.setItem")
    @js.native
    def setItem: js.Function3[/* key */ String, /* value */ String, /* permanent */ js.UndefOr[Boolean], Unit] = js.native
    @JSImport("storage-helper", "default.setItem")
    @js.native
    def setItem(key: String, value: String): Unit = js.native
    @JSImport("storage-helper", "default.setItem")
    @js.native
    def setItem(key: String, value: String, permanent: Boolean): Unit = js.native
    @scala.inline
    def setItem_=(x: js.Function3[/* key */ String, /* value */ String, /* permanent */ js.UndefOr[Boolean], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setItem")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("storage-helper", "clear")
  @js.native
  def clear(): Unit = js.native
  
  @JSImport("storage-helper", "getItem")
  @js.native
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String): String | NonNullable[U] | Null = js.native
  @JSImport("storage-helper", "getItem")
  @js.native
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T): String | NonNullable[U] | Null = js.native
  @JSImport("storage-helper", "getItem")
  @js.native
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T, fallback: U): String | NonNullable[U] | Null = js.native
  @JSImport("storage-helper", "getItem")
  @js.native
  def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: js.UndefOr[scala.Nothing], fallback: U): String | NonNullable[U] | Null = js.native
  
  @JSImport("storage-helper", "removeItem")
  @js.native
  def removeItem(key: String): Unit = js.native
  
  @JSImport("storage-helper", "setItem")
  @js.native
  def setItem(key: String, value: String): Unit = js.native
  @JSImport("storage-helper", "setItem")
  @js.native
  def setItem(key: String, value: String, permanent: Boolean): Unit = js.native
  
  @JSImport("storage-helper", "showStorageLogger")
  @js.native
  def showStorageLogger(enabled: Boolean): Unit = js.native
}
