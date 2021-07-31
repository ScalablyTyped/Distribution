package typings.rethinkdb

import typings.rethinkdb.rethinkdbBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Function extends StObject {
    
    var function: Double = js.native
    
    var geo: Boolean = js.native
    
    var index: String = js.native
    
    var multi: Boolean = js.native
    
    var outdated: Boolean = js.native
    
    var ready: `true` = js.native
  }
  
  trait Index extends StObject {
    
    var index: String
  }
  object Index {
    
    @scala.inline
    def apply(index: String): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timeout extends StObject {
    
    var timeout: Double
  }
  object Timeout {
    
    @scala.inline
    def apply(timeout: Double): Timeout = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeout]
    }
    
    @scala.inline
    implicit class TimeoutMutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseOutdated extends StObject {
    
    var useOutdated: Boolean
  }
  object UseOutdated {
    
    @scala.inline
    def apply(useOutdated: Boolean): UseOutdated = {
      val __obj = js.Dynamic.literal(useOutdated = useOutdated.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseOutdated]
    }
    
    @scala.inline
    implicit class UseOutdatedMutableBuilder[Self <: UseOutdated] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUseOutdated(value: Boolean): Self = StObject.set(x, "useOutdated", value.asInstanceOf[js.Any])
    }
  }
}
