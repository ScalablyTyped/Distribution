package typings.rcDrawer

import typings.rcDrawer.drawerChildMod.DrawerChild
import typings.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import typings.rcDrawer.idrawerproptypesMod.IDrawerProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Open extends StObject {
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var prevProps: IDrawerProps
  }
  object Open {
    
    @scala.inline
    def apply(prevProps: IDrawerProps): Open = {
      val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Open]
    }
    
    @scala.inline
    implicit class OpenMutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPrevProps(value: IDrawerProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrevProps extends StObject {
    
    var _self: DrawerChild
    
    var prevProps: IDrawerChildProps
  }
  object PrevProps {
    
    @scala.inline
    def apply(_self: DrawerChild, prevProps: IDrawerChildProps): PrevProps = {
      val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevProps]
    }
    
    @scala.inline
    implicit class PrevPropsMutableBuilder[Self <: PrevProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrevProps(value: IDrawerChildProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_self(value: DrawerChild): Self = StObject.set(x, "_self", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrevPropsIDrawerChildProps extends StObject {
    
    var prevProps: IDrawerChildProps
  }
  object PrevPropsIDrawerChildProps {
    
    @scala.inline
    def apply(prevProps: IDrawerChildProps): PrevPropsIDrawerChildProps = {
      val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevPropsIDrawerChildProps]
    }
    
    @scala.inline
    implicit class PrevPropsIDrawerChildPropsMutableBuilder[Self <: PrevPropsIDrawerChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrevProps(value: IDrawerChildProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrevPropsIDrawerProps extends StObject {
    
    var prevProps: IDrawerProps
  }
  object PrevPropsIDrawerProps {
    
    @scala.inline
    def apply(prevProps: IDrawerProps): PrevPropsIDrawerProps = {
      val __obj = js.Dynamic.literal(prevProps = prevProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrevPropsIDrawerProps]
    }
    
    @scala.inline
    implicit class PrevPropsIDrawerPropsMutableBuilder[Self <: PrevPropsIDrawerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrevProps(value: IDrawerProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait Target extends StObject {
    
    var open: Boolean
    
    var target: HTMLElement
  }
  object Target {
    
    @scala.inline
    def apply(open: Boolean, target: HTMLElement): Target = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
