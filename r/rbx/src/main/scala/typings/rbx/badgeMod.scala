package typings.rbx

import typings.propTypes.mod.ValidationMap
import typings.rbx.anon.Databadge
import typings.rbx.anon.PartialVariablesDefinitio
import typings.rbx.factoryMod.MakeValidatingTransformFunction
import typings.rbx.factoryMod.TransformFunction
import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod {
  
  @JSImport("rbx/base/helpers/badge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def makePropTypes(): ValidationMap[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")().asInstanceOf[ValidationMap[js.Any]]
  @scala.inline
  def makePropTypes(variables: PartialVariablesDefinitio): ValidationMap[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePropTypes")(variables.asInstanceOf[js.Any]).asInstanceOf[ValidationMap[js.Any]]
  
  @JSImport("rbx/base/helpers/badge", "makeValidatingTransform")
  @js.native
  val makeValidatingTransform: MakeValidatingTransformFunction[BadgeHelpersProps, Databadge] = js.native
  
  @JSImport("rbx/base/helpers/badge", "transform")
  @js.native
  val transform: TransformFunction[BadgeHelpersProps, Databadge] = js.native
  
  trait BadgeHelpersProps extends StObject {
    
    var badge: js.UndefOr[Double | String] = js.undefined
    
    var badgeColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.undefined
    
    var badgeOutlined: js.UndefOr[Boolean] = js.undefined
    
    var badgeRounded: js.UndefOr[Boolean] = js.undefined
    
    var badgeSize: js.UndefOr[small | medium | large] = js.undefined
  }
  object BadgeHelpersProps {
    
    @scala.inline
    def apply(): BadgeHelpersProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeHelpersProps]
    }
    
    @scala.inline
    implicit class BadgeHelpersPropsMutableBuilder[Self <: BadgeHelpersProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: Double | String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
      
      @scala.inline
      def setBadgeOutlined(value: Boolean): Self = StObject.set(x, "badgeOutlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeOutlinedUndefined: Self = StObject.set(x, "badgeOutlined", js.undefined)
      
      @scala.inline
      def setBadgeRounded(value: Boolean): Self = StObject.set(x, "badgeRounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeRoundedUndefined: Self = StObject.set(x, "badgeRounded", js.undefined)
      
      @scala.inline
      def setBadgeSize(value: small | medium | large): Self = StObject.set(x, "badgeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeSizeUndefined: Self = StObject.set(x, "badgeSize", js.undefined)
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    }
  }
}
