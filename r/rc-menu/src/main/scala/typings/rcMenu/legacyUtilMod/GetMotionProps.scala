package typings.rcMenu.legacyUtilMod

import typings.rcMenu.interfaceMod.OpenAnimation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMotionProps extends js.Object {
  var motion: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ js.Any
  ] = js.undefined
  var openAnimation: js.UndefOr[OpenAnimation] = js.undefined
  var openTransitionName: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionNameType */ js.Any
  ] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object GetMotionProps {
  @scala.inline
  def apply(
    motion: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ js.Any = null,
    openAnimation: OpenAnimation = null,
    openTransitionName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionNameType */ js.Any = null,
    prefixCls: String = null
  ): GetMotionProps = {
    val __obj = js.Dynamic.literal()
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation.asInstanceOf[js.Any])
    if (openTransitionName != null) __obj.updateDynamic("openTransitionName")(openTransitionName.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMotionProps]
  }
}

