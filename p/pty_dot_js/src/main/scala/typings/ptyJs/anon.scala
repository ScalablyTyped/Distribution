package typings.ptyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cols extends StObject {
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
  }
  object Cols {
    
    inline def apply(): Cols = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cols]
    }
    
    extension [Self <: Cols](x: Self) {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  trait End extends StObject {
    
    var end: js.UndefOr[Boolean] = js.undefined
  }
  object End {
    
    inline def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
  
  trait Fd extends StObject {
    
    var fd: Double
    
    var pid: Double
    
    var pty: String
  }
  object Fd {
    
    inline def apply(fd: Double, pid: Double, pty: String): Fd = {
      val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fd]
    }
    
    extension [Self <: Fd](x: Self) {
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPty(value: String): Self = StObject.set(x, "pty", value.asInstanceOf[js.Any])
    }
  }
  
  trait Master extends StObject {
    
    var master: Double
    
    var pty: String
    
    var slave: Double
  }
  object Master {
    
    inline def apply(master: Double, pty: String, slave: Double): Master = {
      val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any], slave = slave.asInstanceOf[js.Any])
      __obj.asInstanceOf[Master]
    }
    
    extension [Self <: Master](x: Self) {
      
      inline def setMaster(value: Double): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
      
      inline def setPty(value: String): Self = StObject.set(x, "pty", value.asInstanceOf[js.Any])
      
      inline def setSlave(value: Double): Self = StObject.set(x, "slave", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pid extends StObject {
    
    var fd: Double
    
    var pid: Double
    
    var pty: Double
  }
  object Pid {
    
    inline def apply(fd: Double, pid: Double, pty: Double): Pid = {
      val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], pty = pty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pid]
    }
    
    extension [Self <: Pid](x: Self) {
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPty(value: Double): Self = StObject.set(x, "pty", value.asInstanceOf[js.Any])
    }
  }
}
