package typings.redux

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[Ext1, Ext2] extends StObject {
    
    var dispatch: Ext1 & Ext2
  }
  object `0` {
    
    @scala.inline
    def apply[Ext1, Ext2](dispatch: Ext1 & Ext2): `0`[Ext1, Ext2] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[Ext1, Ext2]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[?, ?], Ext1, Ext2] (val x: Self & (`0`[Ext1, Ext2])) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext1 & Ext2): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1`[Ext1, Ext2, Ext3] extends StObject {
    
    var dispatch: Ext1 & Ext2 & Ext3
  }
  object `1` {
    
    @scala.inline
    def apply[Ext1, Ext2, Ext3](dispatch: Ext1 & Ext2 & Ext3): `1`[Ext1, Ext2, Ext3] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`[Ext1, Ext2, Ext3]]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`[?, ?, ?], Ext1, Ext2, Ext3] (val x: Self & (`1`[Ext1, Ext2, Ext3])) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext1 & Ext2 & Ext3): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2`[Ext1, Ext2, Ext3, Ext4] extends StObject {
    
    var dispatch: Ext1 & Ext2 & Ext3 & Ext4
  }
  object `2` {
    
    @scala.inline
    def apply[Ext1, Ext2, Ext3, Ext4](dispatch: Ext1 & Ext2 & Ext3 & Ext4): `2`[Ext1, Ext2, Ext3, Ext4] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[`2`[Ext1, Ext2, Ext3, Ext4]]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`[?, ?, ?, ?], Ext1, Ext2, Ext3, Ext4] (val x: Self & (`2`[Ext1, Ext2, Ext3, Ext4])) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext1 & Ext2 & Ext3 & Ext4): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  trait `3`[Ext1, Ext2, Ext3, Ext4, Ext5] extends StObject {
    
    var dispatch: Ext1 & Ext2 & Ext3 & Ext4 & Ext5
  }
  object `3` {
    
    @scala.inline
    def apply[Ext1, Ext2, Ext3, Ext4, Ext5](dispatch: Ext1 & Ext2 & Ext3 & Ext4 & Ext5): `3`[Ext1, Ext2, Ext3, Ext4, Ext5] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[`3`[Ext1, Ext2, Ext3, Ext4, Ext5]]
    }
    
    @scala.inline
    implicit class `3MutableBuilder`[Self <: `3`[?, ?, ?, ?, ?], Ext1, Ext2, Ext3, Ext4, Ext5] (val x: Self & (`3`[Ext1, Ext2, Ext3, Ext4, Ext5])) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext1 & Ext2 & Ext3 & Ext4 & Ext5): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CombinedState extends StObject
  
  @js.native
  trait CombinedStateUndefined extends StObject
  
  trait Dispatch[Ext1] extends StObject {
    
    var dispatch: Ext1
  }
  object Dispatch {
    
    @scala.inline
    def apply[Ext1](dispatch: Ext1): Dispatch[Ext1] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispatch[Ext1]]
    }
    
    @scala.inline
    implicit class DispatchMutableBuilder[Self <: Dispatch[?], Ext1] (val x: Self & Dispatch[Ext1]) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext1): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  trait DispatchExt[Ext] extends StObject {
    
    var dispatch: Ext
  }
  object DispatchExt {
    
    @scala.inline
    def apply[Ext](dispatch: Ext): DispatchExt[Ext] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatchExt[Ext]]
    }
    
    @scala.inline
    implicit class DispatchExtMutableBuilder[Self <: DispatchExt[?], Ext] (val x: Self & DispatchExt[Ext]) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unsubscribe extends StObject {
    
    def unsubscribe(): Unit
    @JSName("unsubscribe")
    var unsubscribe_Original: typings.redux.mod.Unsubscribe
  }
  object Unsubscribe {
    
    @scala.inline
    def apply(unsubscribe: () => Unit): Unsubscribe = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Unsubscribe]
    }
    
    @scala.inline
    implicit class UnsubscribeMutableBuilder[Self <: Unsubscribe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}
