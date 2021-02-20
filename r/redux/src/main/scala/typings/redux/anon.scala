package typings.redux

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[Ext1, Ext2] extends StObject {
    
    var dispatch: Ext1 with Ext2 = js.native
  }
  object `0` {
    
    @scala.inline
    def apply[Ext1, Ext2](dispatch: Ext1 with Ext2): `0`[Ext1, Ext2] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[Ext1, Ext2]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[_, _], Ext1, Ext2] (val x: Self with (`0`[Ext1, Ext2])) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext1 with Ext2): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `1`[Ext1, Ext2, Ext3] extends StObject {
    
    var dispatch: Ext1 with Ext2 with Ext3 = js.native
  }
  object `1` {
    
    @scala.inline
    def apply[Ext1, Ext2, Ext3](dispatch: Ext1 with Ext2 with Ext3): `1`[Ext1, Ext2, Ext3] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`[Ext1, Ext2, Ext3]]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`[_, _, _], Ext1, Ext2, Ext3] (val x: Self with (`1`[Ext1, Ext2, Ext3])) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext1 with Ext2 with Ext3): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `2`[Ext1, Ext2, Ext3, Ext4] extends StObject {
    
    var dispatch: Ext1 with Ext2 with Ext3 with Ext4 = js.native
  }
  object `2` {
    
    @scala.inline
    def apply[Ext1, Ext2, Ext3, Ext4](dispatch: Ext1 with Ext2 with Ext3 with Ext4): `2`[Ext1, Ext2, Ext3, Ext4] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[`2`[Ext1, Ext2, Ext3, Ext4]]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`[_, _, _, _], Ext1, Ext2, Ext3, Ext4] (val x: Self with (`2`[Ext1, Ext2, Ext3, Ext4])) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext1 with Ext2 with Ext3 with Ext4): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `3`[Ext1, Ext2, Ext3, Ext4, Ext5] extends StObject {
    
    var dispatch: Ext1 with Ext2 with Ext3 with Ext4 with Ext5 = js.native
  }
  object `3` {
    
    @scala.inline
    def apply[Ext1, Ext2, Ext3, Ext4, Ext5](dispatch: Ext1 with Ext2 with Ext3 with Ext4 with Ext5): `3`[Ext1, Ext2, Ext3, Ext4, Ext5] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[`3`[Ext1, Ext2, Ext3, Ext4, Ext5]]
    }
    
    @scala.inline
    implicit class `3MutableBuilder`[Self <: `3`[_, _, _, _, _], Ext1, Ext2, Ext3, Ext4, Ext5] (val x: Self with (`3`[Ext1, Ext2, Ext3, Ext4, Ext5])) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext1 with Ext2 with Ext3 with Ext4 with Ext5): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CombinedState extends StObject
  
  @js.native
  trait CombinedStateUndefined extends StObject
  
  @js.native
  trait Dispatch[Ext1] extends StObject {
    
    var dispatch: Ext1 = js.native
  }
  object Dispatch {
    
    @scala.inline
    def apply[Ext1](dispatch: Ext1): Dispatch[Ext1] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispatch[Ext1]]
    }
    
    @scala.inline
    implicit class DispatchMutableBuilder[Self <: Dispatch[_], Ext1] (val x: Self with Dispatch[Ext1]) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext1): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DispatchExt[Ext] extends StObject {
    
    var dispatch: Ext = js.native
  }
  object DispatchExt {
    
    @scala.inline
    def apply[Ext](dispatch: Ext): DispatchExt[Ext] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatchExt[Ext]]
    }
    
    @scala.inline
    implicit class DispatchExtMutableBuilder[Self <: DispatchExt[_], Ext] (val x: Self with DispatchExt[Ext]) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Ext): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Unsubscribe extends StObject {
    
    def unsubscribe(): Unit = js.native
    @JSName("unsubscribe")
    var unsubscribe_Original: typings.redux.mod.Unsubscribe = js.native
  }
}
