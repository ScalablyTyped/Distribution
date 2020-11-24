package typings.reactWithStyles.themedStyleSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemedStyleSheet extends js.Object {
  
  def create(makeFromTheme: js.Any): js.Any = js.native
  
  def createLTR(makeFromTheme: js.Any): js.Any = js.native
  
  def createRTL(makeFromTheme: js.Any): js.Any = js.native
  
  def flush(): Unit = js.native
  
  def get(): js.Any = js.native
  
  def registerInterface(registerInterface: js.Any): Unit = js.native
  
  def registerTheme(theme: js.Any): Unit = js.native
  
  def resolve(): js.Any = js.native
  
  def resolveLTR(): js.Any = js.native
  
  def resolveRTL(): js.Any = js.native
}
object ThemedStyleSheet {
  
  @scala.inline
  def apply(
    create: js.Any => js.Any,
    createLTR: js.Any => js.Any,
    createRTL: js.Any => js.Any,
    flush: () => Unit,
    get: () => js.Any,
    registerInterface: js.Any => Unit,
    registerTheme: js.Any => Unit,
    resolve: () => js.Any,
    resolveLTR: () => js.Any,
    resolveRTL: () => js.Any
  ): ThemedStyleSheet = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createLTR = js.Any.fromFunction1(createLTR), createRTL = js.Any.fromFunction1(createRTL), flush = js.Any.fromFunction0(flush), get = js.Any.fromFunction0(get), registerInterface = js.Any.fromFunction1(registerInterface), registerTheme = js.Any.fromFunction1(registerTheme), resolve = js.Any.fromFunction0(resolve), resolveLTR = js.Any.fromFunction0(resolveLTR), resolveRTL = js.Any.fromFunction0(resolveRTL))
    __obj.asInstanceOf[ThemedStyleSheet]
  }
  
  @scala.inline
  implicit class ThemedStyleSheetOps[Self <: ThemedStyleSheet] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: js.Any => js.Any): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateLTR(value: js.Any => js.Any): Self = this.set("createLTR", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateRTL(value: js.Any => js.Any): Self = this.set("createRTL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: () => js.Any): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterInterface(value: js.Any => Unit): Self = this.set("registerInterface", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterTheme(value: js.Any => Unit): Self = this.set("registerTheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolve(value: () => js.Any): Self = this.set("resolve", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResolveLTR(value: () => js.Any): Self = this.set("resolveLTR", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResolveRTL(value: () => js.Any): Self = this.set("resolveRTL", js.Any.fromFunction0(value))
  }
}
