package typings.ssh2.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ssh2.ssh2Numbers.`0`
import typings.ssh2.ssh2Numbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalModes
  extends /* mode */ StringDictionary[js.UndefOr[Double]] {
  
  /** 7 bit mode. */
  var CS7: js.UndefOr[`0` | `1`] = js.native
  
  /** 8 bit mode. */
  var CS8: js.UndefOr[`0` | `1`] = js.native
  
  /** Enable echoing. */
  var ECHO: js.UndefOr[`0` | `1`] = js.native
  
  /** Echo control characters as ^(Char). */
  var ECHOCTL: js.UndefOr[`0` | `1`] = js.native
  
  /** Visually erase chars. */
  var ECHOE: js.UndefOr[`0` | `1`] = js.native
  
  /** Kill character discards current line. */
  var ECHOK: js.UndefOr[`0` | `1`] = js.native
  
  /** Visual erase for line kill. */
  var ECHOKE: js.UndefOr[`0` | `1`] = js.native
  
  /** Echo NL even if ECHO is off. */
  var ECHONL: js.UndefOr[`0` | `1`] = js.native
  
  /** Canonicalize input lines. */
  var ICANON: js.UndefOr[`0` | `1`] = js.native
  
  /** Map CR to NL on input. */
  var ICRNL: js.UndefOr[`0` | `1`] = js.native
  
  /** Enable extensions. */
  var IEXTEN: js.UndefOr[`0` | `1`] = js.native
  
  /** Ignore CR on input. */
  var IGNCR: js.UndefOr[`0` | `1`] = js.native
  
  /** The ignore parity flag.  The parameter SHOULD be `0` if this flag is FALSE, and `1` if it is TRUE. */
  var IGNPAR: js.UndefOr[`0` | `1`] = js.native
  
  /** Ring bell on input queue full. */
  var IMAXBEL: js.UndefOr[`0` | `1`] = js.native
  
  /** Map NL into CR on input. */
  var INLCR: js.UndefOr[`0` | `1`] = js.native
  
  /** Enable checking of parity errors. */
  var INPCK: js.UndefOr[`0` | `1`] = js.native
  
  /** Enable signals INTR, QUIT, [D]SUSP. */
  var ISIG: js.UndefOr[`0` | `1`] = js.native
  
  /** Strip 8th bit off characters. */
  var ISTRIP: js.UndefOr[`0` | `1`] = js.native
  
  /** Translate uppercase characters to lowercase. */
  var IUCLC: js.UndefOr[`0` | `1`] = js.native
  
  /** Any char will restart after stop. */
  var IXANY: js.UndefOr[`0` | `1`] = js.native
  
  /** Enable input flow control. */
  var IXOFF: js.UndefOr[`0` | `1`] = js.native
  
  /** Enable output flow control. */
  var IXON: js.UndefOr[`0` | `1`] = js.native
  
  /** Don't flush after interrupt. */
  var NOFLSH: js.UndefOr[`0` | `1`] = js.native
  
  /** Translate carriage return to newline (output). */
  var OCRNL: js.UndefOr[`0` | `1`] = js.native
  
  /** Convert lowercase to uppercase. */
  var OLCUC: js.UndefOr[`0` | `1`] = js.native
  
  /** Map NL to CR-NL. */
  var ONLCR: js.UndefOr[`0` | `1`] = js.native
  
  /** Newline performs a carriage return (output). */
  var ONLRET: js.UndefOr[`0` | `1`] = js.native
  
  /** Translate newline to carriage return-newline (output). */
  var ONOCR: js.UndefOr[`0` | `1`] = js.native
  
  /** Enable output processing. */
  var OPOST: js.UndefOr[`0` | `1`] = js.native
  
  /** Parity enable. */
  var PARENB: js.UndefOr[`0` | `1`] = js.native
  
  /** Mark parity and framing errors. */
  var PARMRK: js.UndefOr[`0` | `1`] = js.native
  
  /** Odd parity, else even. */
  var PARODD: js.UndefOr[`0` | `1`] = js.native
  
  /** Retype pending input. */
  var PENDIN: js.UndefOr[`0` | `1`] = js.native
  
  /** Stop background jobs from output. */
  var TOSTOP: js.UndefOr[`0` | `1`] = js.native
  
  /** Specifies the input baud rate in bits per second. */
  var TTY_OP_ISPEED: js.UndefOr[Double] = js.native
  
  /** Specifies the output baud rate in bits per second. */
  var TTY_OP_OSPEED: js.UndefOr[Double] = js.native
  
  /** Toggles the flushing of terminal output. */
  var VDISCARD: js.UndefOr[Double] = js.native
  
  /** Another suspend character. */
  var VDSUSP: js.UndefOr[Double] = js.native
  
  /** End-of-file character (sends `EOF` from the terminal). */
  var VEOF: js.UndefOr[Double] = js.native
  
  /** End-of-line character in addition to carriage return and/or linefeed. */
  var VEOL: js.UndefOr[Double] = js.native
  
  /** Additional end-of-line character. */
  var VEOL2: js.UndefOr[Double] = js.native
  
  /** Erase the character to left of the cursor. */
  var VERASE: js.UndefOr[Double] = js.native
  
  /** Character to flush output. */
  var VFLUSH: js.UndefOr[Double] = js.native
  
  /** Interrupt character; `255` if none. Not all of these characters are supported on all systems. */
  var VINTR: js.UndefOr[Double] = js.native
  
  /** Kill the current input line. */
  var VKILL: js.UndefOr[Double] = js.native
  
  /** Enter the next character typed literally, even if it is a special character */
  var VLNEXT: js.UndefOr[Double] = js.native
  
  /** The quit character (sends `SIGQUIT` signal on POSIX systems). */
  var VQUIT: js.UndefOr[Double] = js.native
  
  /** Reprints the current input line. */
  var VREPRINT: js.UndefOr[Double] = js.native
  
  /** Continues paused output (normally control-Q). */
  var VSTART: js.UndefOr[Double] = js.native
  
  /** Prints system status line (load, command, pid, etc). */
  var VSTATUS: js.UndefOr[Double] = js.native
  
  /** Pauses output (normally control-S). */
  var VSTOP: js.UndefOr[Double] = js.native
  
  /** Suspends the current program. */
  var VSUSP: js.UndefOr[Double] = js.native
  
  /** Switch to a different shell layer. */
  var VSWTCH: js.UndefOr[Double] = js.native
  
  /** Erases a word left of cursor. */
  var VWERASE: js.UndefOr[Double] = js.native
  
  /** Enable input and output of uppercase characters by preceding their lowercase equivalents with `\`. */
  var XCASE: js.UndefOr[`0` | `1`] = js.native
}
object TerminalModes {
  
  @scala.inline
  def apply(): TerminalModes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalModes]
  }
  
  @scala.inline
  implicit class TerminalModesOps[Self <: TerminalModes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCS7(value: `0` | `1`): Self = this.set("CS7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCS7: Self = this.set("CS7", js.undefined)
    
    @scala.inline
    def setCS8(value: `0` | `1`): Self = this.set("CS8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCS8: Self = this.set("CS8", js.undefined)
    
    @scala.inline
    def setECHO(value: `0` | `1`): Self = this.set("ECHO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteECHO: Self = this.set("ECHO", js.undefined)
    
    @scala.inline
    def setECHOCTL(value: `0` | `1`): Self = this.set("ECHOCTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteECHOCTL: Self = this.set("ECHOCTL", js.undefined)
    
    @scala.inline
    def setECHOE(value: `0` | `1`): Self = this.set("ECHOE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteECHOE: Self = this.set("ECHOE", js.undefined)
    
    @scala.inline
    def setECHOK(value: `0` | `1`): Self = this.set("ECHOK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteECHOK: Self = this.set("ECHOK", js.undefined)
    
    @scala.inline
    def setECHOKE(value: `0` | `1`): Self = this.set("ECHOKE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteECHOKE: Self = this.set("ECHOKE", js.undefined)
    
    @scala.inline
    def setECHONL(value: `0` | `1`): Self = this.set("ECHONL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteECHONL: Self = this.set("ECHONL", js.undefined)
    
    @scala.inline
    def setICANON(value: `0` | `1`): Self = this.set("ICANON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteICANON: Self = this.set("ICANON", js.undefined)
    
    @scala.inline
    def setICRNL(value: `0` | `1`): Self = this.set("ICRNL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteICRNL: Self = this.set("ICRNL", js.undefined)
    
    @scala.inline
    def setIEXTEN(value: `0` | `1`): Self = this.set("IEXTEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIEXTEN: Self = this.set("IEXTEN", js.undefined)
    
    @scala.inline
    def setIGNCR(value: `0` | `1`): Self = this.set("IGNCR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIGNCR: Self = this.set("IGNCR", js.undefined)
    
    @scala.inline
    def setIGNPAR(value: `0` | `1`): Self = this.set("IGNPAR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIGNPAR: Self = this.set("IGNPAR", js.undefined)
    
    @scala.inline
    def setIMAXBEL(value: `0` | `1`): Self = this.set("IMAXBEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIMAXBEL: Self = this.set("IMAXBEL", js.undefined)
    
    @scala.inline
    def setINLCR(value: `0` | `1`): Self = this.set("INLCR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteINLCR: Self = this.set("INLCR", js.undefined)
    
    @scala.inline
    def setINPCK(value: `0` | `1`): Self = this.set("INPCK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteINPCK: Self = this.set("INPCK", js.undefined)
    
    @scala.inline
    def setISIG(value: `0` | `1`): Self = this.set("ISIG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteISIG: Self = this.set("ISIG", js.undefined)
    
    @scala.inline
    def setISTRIP(value: `0` | `1`): Self = this.set("ISTRIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteISTRIP: Self = this.set("ISTRIP", js.undefined)
    
    @scala.inline
    def setIUCLC(value: `0` | `1`): Self = this.set("IUCLC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIUCLC: Self = this.set("IUCLC", js.undefined)
    
    @scala.inline
    def setIXANY(value: `0` | `1`): Self = this.set("IXANY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIXANY: Self = this.set("IXANY", js.undefined)
    
    @scala.inline
    def setIXOFF(value: `0` | `1`): Self = this.set("IXOFF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIXOFF: Self = this.set("IXOFF", js.undefined)
    
    @scala.inline
    def setIXON(value: `0` | `1`): Self = this.set("IXON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIXON: Self = this.set("IXON", js.undefined)
    
    @scala.inline
    def setNOFLSH(value: `0` | `1`): Self = this.set("NOFLSH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNOFLSH: Self = this.set("NOFLSH", js.undefined)
    
    @scala.inline
    def setOCRNL(value: `0` | `1`): Self = this.set("OCRNL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOCRNL: Self = this.set("OCRNL", js.undefined)
    
    @scala.inline
    def setOLCUC(value: `0` | `1`): Self = this.set("OLCUC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOLCUC: Self = this.set("OLCUC", js.undefined)
    
    @scala.inline
    def setONLCR(value: `0` | `1`): Self = this.set("ONLCR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteONLCR: Self = this.set("ONLCR", js.undefined)
    
    @scala.inline
    def setONLRET(value: `0` | `1`): Self = this.set("ONLRET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteONLRET: Self = this.set("ONLRET", js.undefined)
    
    @scala.inline
    def setONOCR(value: `0` | `1`): Self = this.set("ONOCR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteONOCR: Self = this.set("ONOCR", js.undefined)
    
    @scala.inline
    def setOPOST(value: `0` | `1`): Self = this.set("OPOST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOPOST: Self = this.set("OPOST", js.undefined)
    
    @scala.inline
    def setPARENB(value: `0` | `1`): Self = this.set("PARENB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePARENB: Self = this.set("PARENB", js.undefined)
    
    @scala.inline
    def setPARMRK(value: `0` | `1`): Self = this.set("PARMRK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePARMRK: Self = this.set("PARMRK", js.undefined)
    
    @scala.inline
    def setPARODD(value: `0` | `1`): Self = this.set("PARODD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePARODD: Self = this.set("PARODD", js.undefined)
    
    @scala.inline
    def setPENDIN(value: `0` | `1`): Self = this.set("PENDIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePENDIN: Self = this.set("PENDIN", js.undefined)
    
    @scala.inline
    def setTOSTOP(value: `0` | `1`): Self = this.set("TOSTOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTOSTOP: Self = this.set("TOSTOP", js.undefined)
    
    @scala.inline
    def setTTY_OP_ISPEED(value: Double): Self = this.set("TTY_OP_ISPEED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTTY_OP_ISPEED: Self = this.set("TTY_OP_ISPEED", js.undefined)
    
    @scala.inline
    def setTTY_OP_OSPEED(value: Double): Self = this.set("TTY_OP_OSPEED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTTY_OP_OSPEED: Self = this.set("TTY_OP_OSPEED", js.undefined)
    
    @scala.inline
    def setVDISCARD(value: Double): Self = this.set("VDISCARD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVDISCARD: Self = this.set("VDISCARD", js.undefined)
    
    @scala.inline
    def setVDSUSP(value: Double): Self = this.set("VDSUSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVDSUSP: Self = this.set("VDSUSP", js.undefined)
    
    @scala.inline
    def setVEOF(value: Double): Self = this.set("VEOF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVEOF: Self = this.set("VEOF", js.undefined)
    
    @scala.inline
    def setVEOL(value: Double): Self = this.set("VEOL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVEOL: Self = this.set("VEOL", js.undefined)
    
    @scala.inline
    def setVEOL2(value: Double): Self = this.set("VEOL2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVEOL2: Self = this.set("VEOL2", js.undefined)
    
    @scala.inline
    def setVERASE(value: Double): Self = this.set("VERASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVERASE: Self = this.set("VERASE", js.undefined)
    
    @scala.inline
    def setVFLUSH(value: Double): Self = this.set("VFLUSH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVFLUSH: Self = this.set("VFLUSH", js.undefined)
    
    @scala.inline
    def setVINTR(value: Double): Self = this.set("VINTR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVINTR: Self = this.set("VINTR", js.undefined)
    
    @scala.inline
    def setVKILL(value: Double): Self = this.set("VKILL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVKILL: Self = this.set("VKILL", js.undefined)
    
    @scala.inline
    def setVLNEXT(value: Double): Self = this.set("VLNEXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVLNEXT: Self = this.set("VLNEXT", js.undefined)
    
    @scala.inline
    def setVQUIT(value: Double): Self = this.set("VQUIT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVQUIT: Self = this.set("VQUIT", js.undefined)
    
    @scala.inline
    def setVREPRINT(value: Double): Self = this.set("VREPRINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVREPRINT: Self = this.set("VREPRINT", js.undefined)
    
    @scala.inline
    def setVSTART(value: Double): Self = this.set("VSTART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVSTART: Self = this.set("VSTART", js.undefined)
    
    @scala.inline
    def setVSTATUS(value: Double): Self = this.set("VSTATUS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVSTATUS: Self = this.set("VSTATUS", js.undefined)
    
    @scala.inline
    def setVSTOP(value: Double): Self = this.set("VSTOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVSTOP: Self = this.set("VSTOP", js.undefined)
    
    @scala.inline
    def setVSUSP(value: Double): Self = this.set("VSUSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVSUSP: Self = this.set("VSUSP", js.undefined)
    
    @scala.inline
    def setVSWTCH(value: Double): Self = this.set("VSWTCH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVSWTCH: Self = this.set("VSWTCH", js.undefined)
    
    @scala.inline
    def setVWERASE(value: Double): Self = this.set("VWERASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVWERASE: Self = this.set("VWERASE", js.undefined)
    
    @scala.inline
    def setXCASE(value: `0` | `1`): Self = this.set("XCASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXCASE: Self = this.set("XCASE", js.undefined)
  }
}
