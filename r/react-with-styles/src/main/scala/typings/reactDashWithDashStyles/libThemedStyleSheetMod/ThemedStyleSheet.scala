package typings.reactDashWithDashStyles.libThemedStyleSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemedStyleSheet extends js.Object {
  def create(makeFromTheme: js.Any): js.Any
  def createLTR(makeFromTheme: js.Any): js.Any
  def createRTL(makeFromTheme: js.Any): js.Any
  def flush(): Unit
  def get(): js.Any
  def registerInterface(registerInterface: js.Any): Unit
  def registerTheme(theme: js.Any): Unit
  def resolve(): js.Any
  def resolveLTR(): js.Any
  def resolveRTL(): js.Any
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
}

