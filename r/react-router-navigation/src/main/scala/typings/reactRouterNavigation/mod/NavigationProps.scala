package typings.reactRouterNavigation.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationProps extends NavBarProps {
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var configureTransition: js.UndefOr[
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, 
      /* prevTransitionProps */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any
      ], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionSpec */ _
    ]
  ] = js.native
  var onTransitionEnd: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onTransitionStart: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
}

object NavigationProps {
  @scala.inline
  def apply(): NavigationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationProps]
  }
  @scala.inline
  implicit class NavigationPropsOps[Self <: NavigationProps] (val x: Self) extends AnyVal {
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
    def setCardStyle(value: StyleProp[ViewStyle]): Self = this.set("cardStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardStyle: Self = this.set("cardStyle", js.undefined)
    @scala.inline
    def setCardStyleNull: Self = this.set("cardStyle", null)
    @scala.inline
    def setConfigureTransition(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, /* prevTransitionProps */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any
        ]) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionSpec */ _
    ): Self = this.set("configureTransition", js.Any.fromFunction2(value))
    @scala.inline
    def deleteConfigureTransition: Self = this.set("configureTransition", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: /* repeated */ js.Any => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnTransitionStart(value: /* repeated */ js.Any => Unit): Self = this.set("onTransitionStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransitionStart: Self = this.set("onTransitionStart", js.undefined)
  }
  
}

