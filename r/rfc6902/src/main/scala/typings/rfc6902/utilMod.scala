package typings.rfc6902

import typings.rfc6902.rfc6902Strings.`null`
import typings.rfc6902.rfc6902Strings.`object`
import typings.rfc6902.rfc6902Strings.array
import typings.rfc6902.rfc6902Strings.bigint
import typings.rfc6902.rfc6902Strings.boolean
import typings.rfc6902.rfc6902Strings.function
import typings.rfc6902.rfc6902Strings.number
import typings.rfc6902.rfc6902Strings.string
import typings.rfc6902.rfc6902Strings.symbol
import typings.rfc6902.rfc6902Strings.undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rfc6902/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clone_[T /* <: js.Any */](source: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(source.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def hasOwnProperty_(v: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def hasOwnProperty_(v: js.Symbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def hasOwnProperty_(v: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def objectType(`object`: js.Any): string | number | bigint | boolean | symbol | undefined | `object` | function | `null` | array = ^.asInstanceOf[js.Dynamic].applyDynamic("objectType")(`object`.asInstanceOf[js.Any]).asInstanceOf[string | number | bigint | boolean | symbol | undefined | `object` | function | `null` | array]
}
