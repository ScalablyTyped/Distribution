package typings.rcMentions

import typings.rcMentions.anon.PartialMentionsState
import typings.rcMentions.mentionsMod.MentionsProps
import typings.rcMentions.mentionsMod.MentionsState
import typings.rcMentions.optionMod.OptionProps
import typings.react.mod.SFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-mentions", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.rcMentions.mentionsMod.default {
    def this(props: MentionsProps) = this()
  }
  object default {
    
    @JSImport("rc-mentions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-mentions", "default.Option")
    @js.native
    def Option: SFC[OptionProps] = js.native
    inline def Option_=(x: SFC[OptionProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-mentions", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-mentions", "default.defaultProps.filterOption")
      @js.native
      def filterOption: js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean] = js.native
      inline def filterOption_=(x: js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-mentions", "default.defaultProps.notFoundContent")
      @js.native
      def notFoundContent: String = js.native
      inline def notFoundContent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-mentions", "default.defaultProps.prefix")
      @js.native
      def prefix: String = js.native
      
      @JSImport("rc-mentions", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      inline def prefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-mentions", "default.defaultProps.rows")
      @js.native
      def rows: Double = js.native
      inline def rows_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rows")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-mentions", "default.defaultProps.split")
      @js.native
      def split: String = js.native
      inline def split_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("split")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-mentions", "default.defaultProps.validateSearch")
      @js.native
      def validateSearch: js.Function2[/* text */ String, /* props */ MentionsProps, Boolean] = js.native
      inline def validateSearch_=(x: js.Function2[/* text */ String, /* props */ MentionsProps, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateSearch")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(props: MentionsProps, prevState: MentionsState): PartialMentionsState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialMentionsState]
  }
}
