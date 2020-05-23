package typings.rcDropdown.dropdownMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TriggerProps * / any, 'getPopupContainer' | 'children'> */
trait DropdownProps extends js.Object {
  var align: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any
  ] = js.undefined
  var alignPoint: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationType */ js.Any
  ] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var getPopupContainer: js.UndefOr[js.Any] = js.undefined
  var hideAction: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ]
  ] = js.undefined
  var minOverlayWidthMatchTrigger: js.UndefOr[Boolean] = js.undefined
  var onOverlayClick: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var openClassName: js.UndefOr[String] = js.undefined
  var overlay: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.undefined
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var placements: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
  ] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showAction: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ]
  ] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ])
  ] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    align: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AlignType */ js.Any = null,
    alignPoint: js.UndefOr[Boolean] = js.undefined,
    animation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationType */ js.Any = null,
    children: js.Any = null,
    getPopupContainer: js.Any = null,
    hideAction: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ] = null,
    minOverlayWidthMatchTrigger: js.UndefOr[Boolean] = js.undefined,
    onOverlayClick: /* e */ Event => Unit = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    openClassName: String = null,
    overlay: js.Function0[ReactElement] | ReactElement = null,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    placement: String = null,
    placements: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any = null,
    prefixCls: String = null,
    showAction: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ] = null,
    transitionName: String = null,
    trigger: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ js.Any) | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ActionType */ _
    ]) = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(alignPoint)) __obj.updateDynamic("alignPoint")(alignPoint.get.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer.asInstanceOf[js.Any])
    if (hideAction != null) __obj.updateDynamic("hideAction")(hideAction.asInstanceOf[js.Any])
    if (!js.isUndefined(minOverlayWidthMatchTrigger)) __obj.updateDynamic("minOverlayWidthMatchTrigger")(minOverlayWidthMatchTrigger.get.asInstanceOf[js.Any])
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(js.Any.fromFunction1(onOverlayClick))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (placements != null) __obj.updateDynamic("placements")(placements.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showAction != null) __obj.updateDynamic("showAction")(showAction.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
}

