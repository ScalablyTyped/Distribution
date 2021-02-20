package typings.ptyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cols extends StObject {
    
    var cols: js.UndefOr[Double] = js.native
    
    var rows: js.UndefOr[Double] = js.native
  }
  object Cols {
    
    @scala.inline
    def apply(): Cols = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cols]
    }
    
    @scala.inline
    implicit class ColsMutableBuilder[Self <: Cols] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: js.UndefOr[Boolean] = js.native
  }
  object End {
    
    @scala.inline
    def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
  
  @js.native
  trait Fd extends StObject {
    
    var fd: Double = js.native
    
    var pid: Double = js.native
    
    var pty: String = js.native
  }
  object Fd {
    
    @scala.inline
    def apply(fd: Double, pid: Double, pty: String): Fd = {
      val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fd]
    }
    
    @scala.inline
    implicit class FdMutableBuilder[Self <: Fd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPty(value: String): Self = StObject.set(x, "pty", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Master extends StObject {
    
    var master: Double = js.native
    
    var pty: String = js.native
    
    var slave: Double = js.native
  }
  object Master {
    
    @scala.inline
    def apply(master: Double, pty: String, slave: Double): Master = {
      val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
      __obj.asInstanceOf[Master]
    }
    
    @scala.inline
    implicit class MasterMutableBuilder[Self <: Master] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaster(value: Double): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPty(value: String): Self = StObject.set(x, "pty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlave(value: Double): Self = StObject.set(x, "slave", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pid extends StObject {
    
    var fd: Double = js.native
    
    var pid: Double = js.native
    
    var pty: Double = js.native
  }
  object Pid {
    
    @scala.inline
    def apply(fd: Double, pid: Double, pty: Double): Pid = {
      val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pid]
    }
    
    @scala.inline
    implicit class PidMutableBuilder[Self <: Pid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPty(value: Double): Self = StObject.set(x, "pty", value.asInstanceOf[js.Any])
    }
  }
}
