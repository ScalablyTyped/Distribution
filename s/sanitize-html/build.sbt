organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.20.1-dt-20190916Z-7ba886"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190326Z-ad1874",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190326Z-31c3b5",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190712Z-f51b66",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        