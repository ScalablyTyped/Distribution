package typings.reactRouterNavigation.mod

import typings.reactRouterNavigation.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsProps extends TabBarProps {
  var configureTransition: js.UndefOr[
    js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, 
      /* prevTransitionProps */ js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any
      ], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionSpec */ _
    ]
  ] = js.native
  // <Tabs /> only:
  var initialLayout: js.UndefOr[Height] = js.native
}

object TabsProps {
  @scala.inline
  def apply(): TabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsProps]
  }
  @scala.inline
  implicit class TabsPropsOps[Self <: TabsProps] (val x: Self) extends AnyVal {
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
    def setConfigureTransition(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ /* transitionProps */ js.Any, /* prevTransitionProps */ js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionProps */ js.Any
        ]) => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NavigationTransitionSpec */ _
    ): Self = this.set("configureTransition", js.Any.fromFunction2(value))
    @scala.inline
    def deleteConfigureTransition: Self = this.set("configureTransition", js.undefined)
    @scala.inline
    def setInitialLayout(value: Height): Self = this.set("initialLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialLayout: Self = this.set("initialLayout", js.undefined)
  }
  
}

