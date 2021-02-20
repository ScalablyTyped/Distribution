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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rfc6902/util", "clone")
  @js.native
  def clone_[T /* <: js.Any */](source: T): T = js.native
  
  @JSImport("rfc6902/util", "hasOwnProperty")
  @js.native
  def hasOwnProperty_(v: String): Boolean = js.native
  @JSImport("rfc6902/util", "hasOwnProperty")
  @js.native
  def hasOwnProperty_(v: js.Symbol): Boolean = js.native
  @JSImport("rfc6902/util", "hasOwnProperty")
  @js.native
  def hasOwnProperty_(v: Double): Boolean = js.native
  
  @JSImport("rfc6902/util", "objectType")
  @js.native
  def objectType(`object`: js.Any): string | number | bigint | boolean | symbol | undefined | `object` | function | `null` | array = js.native
}
