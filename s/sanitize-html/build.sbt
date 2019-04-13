organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.18.2-dt-20190326Z-38496d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190326Z-fe25bd",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190326Z-0dfe76",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190326Z-c56621",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        