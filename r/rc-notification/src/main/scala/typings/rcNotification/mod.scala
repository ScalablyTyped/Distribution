package typings.rcNotification

import typings.rcNotification.anon.Left
import typings.rcNotification.anon.NotificationPropsgetConta
import typings.rcNotification.notificationMod.NotificationInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-notification", JSImport.Default)
  @js.native
  class default ()
    extends typings.rcNotification.notificationMod.default
  object default {
    
    @JSImport("rc-notification", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-notification", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-notification", "default.defaultProps.animation")
      @js.native
      def animation: String = js.native
      @scala.inline
      def animation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animation")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-notification", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-notification", "default.defaultProps.style")
      @js.native
      def style: Left = js.native
      @scala.inline
      def style_=(x: Left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-notification", "default.newInstance")
    @js.native
    def newInstance: js.Function2[
        /* properties */ NotificationPropsgetConta, 
        /* callback */ js.Function1[/* instance */ NotificationInstance, Unit], 
        Unit
      ] = js.native
    @scala.inline
    def newInstance_=(
      x: js.Function2[
          /* properties */ NotificationPropsgetConta, 
          /* callback */ js.Function1[/* instance */ NotificationInstance, Unit], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newInstance")(x.asInstanceOf[js.Any])
  }
}
