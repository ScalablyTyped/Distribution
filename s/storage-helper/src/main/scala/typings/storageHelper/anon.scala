package typings.storageHelper

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T /* <: js.UndefOr[Boolean] */, U](key: String): String | NonNullable[U] | Null = js.native
    def apply[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T): String | NonNullable[U] | Null = js.native
    def apply[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T, fallback: U): String | NonNullable[U] | Null = js.native
    def apply[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: Unit, fallback: U): String | NonNullable[U] | Null = js.native
  }
}
