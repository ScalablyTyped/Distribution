package typings.reactMdTransition.crossFadeMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.reactMdTransition.anon.PickCrossFadePropshiddenc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Collapse` is really just a convenience wrapper for the `useCrossFade`
  * hook that triggers the transition by cloning the `ref` and `className` into
  * the `children` of this component.
  *
  * This transition will only fire on mount and when the `appear` prop is set to
  * `true`, so the way to trigger new animations is by changing the `key` for
  * this component so it re-mounts. However it is generally not recommended to
  * fire this transition on first page load especially when dealing with server
  * side rendering. A simple way to work around this is have the `CrossFade` near
  * the root of the app and just disable the `appear` prop until the first
  * render.
  *
  * If you want more fine-grain control over the transition, it is recommended to
  * use the `useCrossFade` hook instead.
  */
@JSImport("@react-md/transition/types/CrossFade", JSImport.Default)
@js.native
object default extends TopLevel[ForwardRefExoticComponent[PickCrossFadePropshiddenc]]

