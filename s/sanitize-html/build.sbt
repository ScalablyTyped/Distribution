organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.20.1-dt-20190916Z-bf9320"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190326Z-3936d9",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190326Z-0c0418",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190712Z-de8902",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        