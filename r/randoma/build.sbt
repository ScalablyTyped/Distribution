organization := "org.scalablytyped"
name := "randoma"
version := "1.3.0-c3658c"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-7ef208",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-c4a5c3",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-b17167",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        