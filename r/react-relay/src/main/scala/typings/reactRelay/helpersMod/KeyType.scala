package typings.reactRelay.helpersMod

import typings.relayRuntime.relayStoreTypesMod.FragmentReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{   $data :TData | undefined,    $fragmentRefs :relay-runtime.relay-runtime.FragmentReference}> */
@js.native
trait KeyType[TData] extends js.Object {
  
  @JSName(" $data")
  val Space$data: js.UndefOr[TData] = js.native
  
  @JSName(" $fragmentRefs")
  val Space$fragmentRefs: FragmentReference = js.native
}
object KeyType {
  
  @scala.inline
  def apply[TData](Space$fragmentRefs: FragmentReference): KeyType[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(" $fragmentRefs")(Space$fragmentRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyType[TData]]
  }
  
  @scala.inline
  implicit class KeyTypeOps[Self <: KeyType[_], TData] (val x: Self with KeyType[TData]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSpace$fragmentRefs(value: FragmentReference): Self = this.set(" $fragmentRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace$data(value: TData): Self = this.set(" $data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace$data: Self = this.set(" $data", js.undefined)
  }
}
