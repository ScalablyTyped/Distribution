package typings.relayRuntime.mod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayStoreTypesMod.ReaderSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("relay-runtime", "getSelectorsFromObject")
@js.native
object getSelectorsFromObject extends js.Object {
  
  def apply(fragments: StringDictionary[ReaderFragment], `object`: StringDictionary[js.Any]): StringDictionary[ReaderSelector] = js.native
}
