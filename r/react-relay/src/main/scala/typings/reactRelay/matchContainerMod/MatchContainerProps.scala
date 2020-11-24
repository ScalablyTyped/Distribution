package typings.reactRelay.matchContainerMod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  fallback :TFallback | null | undefined, loader (module : unknown): react.react.ComponentType<TProps>,   match :react-relay.react-relay/lib/relay-experimental/MatchContainer.MatchPointer | react-relay.react-relay/lib/relay-experimental/MatchContainer.TypenameOnlyPointer | null | undefined,   props :TProps | undefined}> */
@js.native
trait MatchContainerProps[TProps, TFallback] extends js.Object {
  
  val fallback: js.UndefOr[TFallback | Null] = js.native
  
  val loader: js.Function1[/* module */ js.Any, ComponentType[TProps]] = js.native
  
  val `match`: js.UndefOr[MatchPointer | TypenameOnlyPointer | Null] = js.native
  
  val props: js.UndefOr[TProps] = js.native
}
object MatchContainerProps {
  
  @scala.inline
  def apply[TProps, TFallback](loader: /* module */ js.Any => ComponentType[TProps]): MatchContainerProps[TProps, TFallback] = {
    val __obj = js.Dynamic.literal(loader = js.Any.fromFunction1(loader))
    __obj.asInstanceOf[MatchContainerProps[TProps, TFallback]]
  }
  
  @scala.inline
  implicit class MatchContainerPropsOps[Self <: MatchContainerProps[_, _], TProps, TFallback] (val x: Self with (MatchContainerProps[TProps, TFallback])) extends AnyVal {
    
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
    def setLoader(value: /* module */ js.Any => ComponentType[TProps]): Self = this.set("loader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallback(value: TFallback): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setFallbackNull: Self = this.set("fallback", null)
    
    @scala.inline
    def setMatch(value: MatchPointer | TypenameOnlyPointer): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setMatchNull: Self = this.set("match", null)
    
    @scala.inline
    def setProps(value: TProps): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
